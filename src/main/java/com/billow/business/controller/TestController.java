package com.billow.business.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.billow.annotation.SystemControllerLog;
import com.billow.business.model.User;
import com.billow.business.service.UserService;
import com.billow.mq.producer.queue.QueueSender;
import com.billow.mq.producer.topic.TopicSender;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UserService userService;

//	@Autowired
	private QueueSender queueSender;
//	@Autowired
	private TopicSender topicSender;

	@RequestMapping("/index")
	public String test(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = new User();
		user.setAge(23);
		user.setPassword("111");
		user.setPhoneNumber("1231313");
		user.setUserName("Xiao-Y");
		user.setUserId(1);
		session.setAttribute("temp", user);
		return "index";
	}

	@SystemControllerLog(function = "测试查询列表", module = "测试", operation = "查询", note = "非异步")
	@RequestMapping("/testList")
	public List<User> testList(Model model, User user, HttpServletRequest request) {
		// Integer pageSize = RequestUtils.getPageSize(request);
		// Integer targetPage = RequestUtils.getTargetPage(request);

		PageHelper.startPage(2, 10);
		List<User> users = userService.findUserList(user);
		// int count = userService.findUserCount(user);
		return users;
	}

	@RequestMapping("/testJqueryUi")
	public String testJqueryUi(Model model, User user, HttpServletRequest request) {
		return "testJqueryUi";
	}

	@RequestMapping("/testSession")
	public String testSession() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		HttpSession session = request.getSession();
		return session.getId();
	}

	@RequestMapping("/indexSender")
	public String indexSender(HttpServletRequest request) {
		return "indexSender";
	}

	@ResponseBody
	@RequestMapping("/testQueueSender")
	public String testQueueSender(@RequestParam("message") String message) {
		String queueName = "com.bilow.queue";
		String opt = "";
		try {
			queueSender.sendMessage(queueName, message);
			opt = "suc";
		} catch (Exception e) {
			opt = e.getCause().toString();
		}
		return opt;
	}

	@ResponseBody
	@RequestMapping("/testTopicSender")
	public String testTopicSender(@RequestParam("message") String message) {
		String queueName = "com.bilow.topic";
		String opt = "";
		try {
			topicSender.sendMessage(queueName, message);
			opt = "suc";
		} catch (Exception e) {
			opt = e.getCause().toString();
		}
		return opt;
	}
}

package com.billow.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billow.annotation.SystemControllerLog;
import com.billow.model.User;
import com.billow.service.UserService;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String test() {
		// userService.deleteTest();
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
}

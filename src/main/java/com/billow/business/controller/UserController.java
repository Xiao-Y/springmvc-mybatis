package com.billow.business.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billow.annotation.SystemControllerLog;
import com.billow.business.model.User;
import com.billow.business.service.UserService;
import com.billow.utils.RequestUtils;
import com.billow.utils.ToolsUtils;
import com.github.pagehelper.PageHelper;

/**
 * 返回JSON
 * 
 * @author liuyongtao
 * 
 * @date 2016年10月8日 上午8:46:55
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("/findUserList2")
	@ResponseBody
	public List<User> findUserList2() {
		List<User> users = userService.findUserList(null);
		for (User user : users) {
			logger.info(user);
		}
		return users;
	}

	@SystemControllerLog(function = "查询用户列表", module = "用户管理", operation = "查询", note = "非异步")
	@RequestMapping("/findUserList")
	public String findUserList(Model model, User user, HttpServletRequest request) {
		Integer pageSize = RequestUtils.getPageSize(request);
		Integer targetPage = RequestUtils.getTargetPage(request);
		PageHelper.startPage(targetPage, pageSize);

		List<User> users = userService.findUserList(null);
		int count = userService.findUserCount(null);
		user.setRecordCount(count);
		model.addAttribute("userModel", user);
		model.addAttribute("users", users);
		return "user/findUserList";
	}

	@RequestMapping("/prepareForUserAdd")
	public String prepareForUserAdd(Model model) {
		// 因为jsp中使用了modelAttribute属性，所以必须在request域中有一个"user"
		model.addAttribute("user", new User());
		return "user/prepareForUserAdd";
	}

	@RequestMapping("/submitUserInfo")
	public String submitUserInfo(@Valid User user, BindingResult result, Model model) {
		// @Valid 表示按照在实体上标记的注解验证参数
		if (result.hasErrors()) {
			List<ObjectError> list = result.getAllErrors();
			for (ObjectError error : list) {
				logger.info(error.getCode() + "---" + error.getArguments() + "---" + error.getDefaultMessage());
			}
			return "user/prepareForUserAdd";
		}
		userService.insert(user);
		return "redirect:findUserList";
	}

	@RequestMapping(value = "/prepareForUserUpdate/{userId}", method = RequestMethod.GET)
	public String prepareForUserUpdate(@PathVariable Integer userId, Model model) {
		User user = userService.selectByPrimaryKey(userId);
		model.addAttribute("user", user);
		return "user/prepareForUserAdd";
	}

	@RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
	public String updateUserInfo(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "user/prepareForUserAdd";
		}
		userService.updateByPrimaryKey(user);
		return "redirect:findUserList";
	}

	@RequestMapping("/deleteUserByUserId/{userId}")
	public String deleteUserByUserId(@PathVariable Integer userId) {
		userService.deleteByPrimaryKey(userId);
		return "redirect:findUserList";
	}

	@ResponseBody
	@RequestMapping(value = "/searchUser")
	public List<String> searchUser(@RequestBody User user) {
		String userName = user.getUserName();
		logger.info(userName);
		List<User> users = userService.findUserList(user);
		List<String> userNames = ToolsUtils.getListByFieldValue(users, "userName");
		return userNames;
	}
}

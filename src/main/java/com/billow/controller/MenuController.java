package com.billow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import utils.ToolsUtils;

import com.billow.model.Menu;
import com.billow.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping("/index")
	public void index(HttpRequestHandlerServlet request) {
		Menu menu = new Menu();
		menu.setPid(0);
		List<Menu> selectAll = menuService.selectAll(menu);
		if (ToolsUtils.isNotEmpty(selectAll)) {
			for (Menu temp : selectAll) {
				List<Menu> childList = menuService.getMenuChildList(temp.getId());
				System.out.println(childList);
			}
		}
		// System.out.println(selectAll);
	}
}

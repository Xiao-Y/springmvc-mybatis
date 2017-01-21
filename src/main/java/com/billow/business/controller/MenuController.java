package com.billow.business.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import com.alibaba.fastjson.JSON;
import com.billow.business.model.Menu;
import com.billow.business.service.MenuService;
import com.billow.collections.MenuComparator;
import com.billow.utils.ToolsUtils;

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
		Collections.sort(selectAll, new MenuComparator());
		if (ToolsUtils.isNotEmpty(selectAll)) {
			for (Menu temp : selectAll) {
				List<Menu> childList = menuService.getMenuChildList(temp.getId());
				Collections.sort(childList, new MenuComparator());
				temp.setChildren(childList);
				// System.out.println(childList);
			}
		}
		System.out.println(JSON.toJSONString(selectAll));
	}
}

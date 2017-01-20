package com.billow.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.billow.base.service.impl.BaseServiceImpl;
import com.billow.mapper.MenuMapper;
import com.billow.model.Menu;
import com.billow.service.MenuService;

@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {

	private MenuMapper menuMapper;

	@Resource
	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
		super.setBaseMapper(menuMapper);
	}

	@Override
	public List<Menu> getMenuChildList(int id) {
		return menuMapper.getMenuChildList(id);
	}

	@Override
	public List<Menu> selectAll(Menu menu) {
		return menuMapper.selectAll(menu);
	}
}

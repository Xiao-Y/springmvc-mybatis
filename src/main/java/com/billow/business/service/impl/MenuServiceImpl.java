package com.billow.business.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.billow.base.service.impl.BaseServiceImpl;
import com.billow.business.mapper.MenuMapper;
import com.billow.business.model.Menu;
import com.billow.business.service.MenuService;

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

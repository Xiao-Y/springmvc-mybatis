package com.billow.service;

import java.util.List;

import com.billow.base.service.BaseService;
import com.billow.model.Menu;

public interface MenuService extends BaseService<Menu> {
	public List<Menu> getMenuChildList(int id);

	public List<Menu> selectAll(Menu menu);
}

package com.billow.mapper;

import java.util.List;

import com.billow.base.mapper.BaseMapper;
import com.billow.model.Menu;

public interface MenuMapper extends BaseMapper<Menu> {

	public List<Menu> getMenuChildList(int id);

	public List<Menu> selectAll(Menu menu);
}
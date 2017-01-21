package com.billow.collections;

import java.util.Comparator;

import com.billow.business.model.Menu;

/**
 * 菜单排序比较器
 * 
 * @author liuyongtao
 * 
 * @date 2017年1月21日 上午9:36:30
 */
public class MenuComparator implements Comparator<Menu> {

	public int compare(Menu m1, Menu m2) {
		return m1.getDisplayno().compareTo(m2.getDisplayno());
	}

}

package com.billow.service;

import com.billow.model.SystemLog;

public interface SystemLogService {
	int deleteByPrimaryKey(Integer id);

	int insert(SystemLog record);

	int insertSelective(SystemLog record);

	SystemLog selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(SystemLog record);

	int updateByPrimaryKey(SystemLog record);

	void persistLog(SystemLog log);
}

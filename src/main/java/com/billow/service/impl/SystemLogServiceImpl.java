package com.billow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billow.mapper.SystemLogMapper;
import com.billow.model.SystemLog;
import com.billow.service.SystemLogService;

@Service
public class SystemLogServiceImpl implements SystemLogService {

	@Autowired
	private SystemLogMapper SystemLogMapper;

	@Override
	public int deleteByPrimaryKey(Integer SystemLogId) {
		return SystemLogMapper.deleteByPrimaryKey(SystemLogId);
	}

	@Override
	public int insert(SystemLog record) {
		return SystemLogMapper.insert(record);
	}

	@Override
	public int insertSelective(SystemLog record) {
		return SystemLogMapper.insertSelective(record);
	}

	@Override
	public SystemLog selectByPrimaryKey(Integer SystemLogId) {
		return SystemLogMapper.selectByPrimaryKey(SystemLogId);
	}

	@Override
	public int updateByPrimaryKeySelective(SystemLog record) {
		return SystemLogMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SystemLog record) {
		return SystemLogMapper.updateByPrimaryKey(record);
	}

	@Override
	public void persistLog(SystemLog log) {
		SystemLogMapper.insert(log);
	}
}

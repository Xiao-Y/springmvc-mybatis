package com.billow.business.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.billow.base.service.impl.BaseServiceImpl;
import com.billow.business.mapper.SystemLogMapper;
import com.billow.business.model.SystemLog;
import com.billow.business.service.SystemLogService;

@Service
public class SystemLogServiceImpl extends BaseServiceImpl<SystemLog> implements SystemLogService {

	private SystemLogMapper systemLogMapper;

	@Resource
	public void setSystemLogMapper(SystemLogMapper systemLogMapper) {
		this.systemLogMapper = systemLogMapper;
		super.setBaseMapper(systemLogMapper);
	}

	@Override
	public void persistLog(SystemLog log) {
		systemLogMapper.insert(log);
	}
}

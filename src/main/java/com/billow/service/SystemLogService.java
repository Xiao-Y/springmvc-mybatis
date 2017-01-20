package com.billow.service;

import com.billow.base.service.BaseService;
import com.billow.model.SystemLog;

public interface SystemLogService extends BaseService<SystemLog> {

	void persistLog(SystemLog log);
}

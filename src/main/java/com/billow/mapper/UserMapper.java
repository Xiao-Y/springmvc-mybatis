package com.billow.mapper;

import java.util.List;

import com.billow.base.mapper.BaseMapper;
import com.billow.model.User;

public interface UserMapper extends BaseMapper<User> {

	List<User> findUserList(User user);

	int findUserCount(User user);
}
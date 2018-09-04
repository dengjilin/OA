package com.javen.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.dao.UserDao;
import com.javen.entity.User;
import com.javen.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDao userDao;
	@Override
	public User login(Map<String, String> map) {
		
		return userDao.login(map);
	}

}

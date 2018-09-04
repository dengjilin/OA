package com.javen.dao;

import java.util.Map;

import com.javen.entity.User;

public interface UserDao {
   public User login(Map<String, String> map);
}

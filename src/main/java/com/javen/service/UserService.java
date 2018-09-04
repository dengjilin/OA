package com.javen.service;

import java.util.Map;

import com.javen.entity.User;

public interface UserService {
  public User login(Map<String, String> map);
}

package com.javen.service;

import java.util.Map;

import com.javen.entity.UserInfo;

public interface UserInfoService {
    public int insertInfo(UserInfo userInfo);
    
    public int updateInfo(UserInfo userInfo);
    
    public Map<String, String> queryUserInfo(String id);
    
    public int deleteUserInfo(String id);
}

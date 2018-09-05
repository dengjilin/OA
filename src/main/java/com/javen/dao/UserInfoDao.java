package com.javen.dao;

import java.util.Map;

import com.javen.entity.UserInfo;

public interface UserInfoDao {
    public int insetInfo(UserInfo userInfo);
	
    public int updateInfo(UserInfo user);
    
	public Map<String, String> queryUserInfo(String id);
    
    public int deleteUserInfo(String id);
}

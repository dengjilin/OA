package com.javen.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.dao.UserInfoDao;
import com.javen.entity.UserInfo;
import com.javen.service.UserInfoService;
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;
	@Override
	public int insertInfo(UserInfo userInfo) {
      int i=userInfoDao.insetInfo(userInfo);
		return i;
	}

	@Override
	public int updateInfo(UserInfo userInfo) {
	int i=	userInfoDao.updateInfo(userInfo);
		return i;
	}

	@Override
	public Map<String, String> queryUserInfo(String id) {
		
		return userInfoDao.queryUserInfo(id);
	}

	@Override
	public int deleteUserInfo(String id) {
	int i=	userInfoDao.deleteUserInfo(id);
		return i;
	}

}

package com.javaen.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.jms.Session;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javen.dao.UserInfoDao;
import com.javen.entity.UserInfo;
import com.javen.service.UserInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml", "classpath:spring-mvc.xml" })
public class UserInfoTest {
	/*@Resource(name="userInfoServiceImpl")
   private UserInfoService userInfoService;*/
	@Autowired
	private UserInfoDao userInfoDao;
	@org.junit.Test
	public void Test() {
		try {
			/*int i=	userInfoService.deleteUserInfo("5");
			System.out.println(i);*/
			/*UserInfo u=new UserInfo();
			u.setId("5");
			u.setAge(23);
			u.setBirthday("1968-2-23");
			userInfoService.insertInfo(u);*/
		/*Map<String, String> map=	userInfoService.queryUserInfo("1");
		  System.out.println(map.toString());*/
			/*UserInfo u=new UserInfo();
			u.setId("3");
			u.setAge(3333);
		int i=	userInfoService.updateInfo(u);
			System.out.println(i);*/
			UserInfo u=new UserInfo();
			u.setId("3");
			u.setAge(3333);
			int i=	userInfoDao.updateInfo(u);
		
			
			System.out.println(u.getAge());
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}

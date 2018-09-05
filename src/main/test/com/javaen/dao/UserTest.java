package com.javaen.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.javen.dao.UserDao;
import com.javen.entity.User;
import com.javen.service.UserInfoService;
import com.javen.service.UserService;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml", "classpath:spring-mvc.xml" })
public class UserTest extends TestCase {
	/*@Autowired
	private UserDao userDao;*/
     @Resource(name="userService")
	private UserService userService;
	
	@Test
	public void test() {
		try {
			Map<String, String> parms = new HashMap<String, String>();
			parms.put("username", "admin");
			parms.put("password", "123456");
			User user =userService.login(parms);
			String userName= null;
			if (user != null ) {
				userName = user.getUsername();
			}
			System.out.println(userName+"=======");
			/*User user=new User();
			user.setId(12);
			user.setPassword("34567890");
			user.setUserName("ÕÅÈý");
		int i=	userDao.updataLogin(user);
			System.out.println(i+"----");*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

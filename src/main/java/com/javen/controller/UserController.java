package com.javen.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javen.entity.User;
import com.javen.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	@Resource(name="userService")
   private UserService userService;
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request,ModelAndView mv) {
		Map<String, String> map=new HashMap<>();
		map.put("username", request.getParameter("username"));
		map.put("password", request.getParameter("password"));
		User user=	userService.login(map);
		if(user!=null) {
			mv.setViewName("index");//��½�ɹ�ҳ��
		}else {
			mv.addObject("message","�û����������������,����������");
			mv.setViewName("login");//��½ҳ��
		}
			return mv;
		}
}

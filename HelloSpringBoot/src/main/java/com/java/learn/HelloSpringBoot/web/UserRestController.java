package com.java.learn.HelloSpringBoot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.learn.HelloSpringBoot.bean.User;
import com.java.learn.HelloSpringBoot.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public boolean addUser(User user) {
		System.out.println("开始新增用户");
		return userService.addUser(user);
	}

	@RequestMapping(value = "/queryUserById", method = RequestMethod.GET)
	public User queryUserById(int id) {
		System.out.println("开始查询用户");
		return userService.queryUserById(id);
	}
}

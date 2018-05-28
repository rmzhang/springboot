package com.java.learn.HelloSpringBoot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.learn.HelloSpringBoot.bean.User;
import com.java.learn.HelloSpringBoot.dao.UserDao;
import com.java.learn.HelloSpringBoot.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public boolean addUser(User user) {
		boolean flag=false;
		try {
			userDao.addUser(user);
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User queryUserById(int id) {
		return userDao.queryUserById(id);
	}

	public User queryUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public User queryUserByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

}

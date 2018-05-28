package com.java.learn.HelloSpringBoot.dao;

import com.java.learn.HelloSpringBoot.bean.User;

public interface UserDao {

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	User queryUserById(int id);

	User queryUserByName(String name);

	User queryUserByAge(int age);
}

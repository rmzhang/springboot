package com.java.learn.HelloSpringBoot.service;

import com.java.learn.HelloSpringBoot.bean.User;

public interface UserService {
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);

	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user);

	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public boolean deleteUser(int id);
	
	/**
	 * 根据id查找用户
	 * @param id
	 * @return
	 */
	public User queryUserById(int id);

	/**
	 * 根据姓名查找用户
	 * @param name
	 * @return
	 */
	public User queryUserByName(String name);

	/**
	 * 根据年龄查找用户
	 * @param age
	 * @return
	 */
	public User queryUserByAge(int age);
}

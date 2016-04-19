package com.zxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxc.dao.UserDao;
import com.zxc.entity.User;

@Service
public class UserService {
	
	private UserDao userDao;
	
	public User selectUser(User user){
		userDao = new UserDao();
		return userDao.selectUser(user);
	}

	public Integer insertUser(User user){
		userDao = new UserDao();
		return userDao.insertUser(user);
	}
	
	public List<User> selectUsers(){
		userDao = new UserDao();
		return userDao.selectUsers();
	}
	
	public Integer updateUser(User user){
		userDao = new UserDao();
		return userDao.updateUser(user);
	}
	
	public Integer deleteUser(User user){
		userDao = new UserDao();
		return userDao.deleteUser(user);
	}
	
	public static void main(String[] args) {
		UserService us = new UserService();
		User user = new User();
		user.setUsername("chaos");
		user.setPassword("chaos");
		us.selectUser(user);
	}
	
}

package com.zxc.mapper;

import java.util.List;

import com.zxc.entity.User;

public interface UserMapper {

	public User selectUser(User user);

	public Integer insertUser(User user);
	
	public List<User> selectUsers();
	
	public Integer updateUser(User user);
	
	public Integer deleteUser(User user);

	
}

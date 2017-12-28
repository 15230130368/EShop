package com.zkx.mapper;

import com.zkx.pojo.User;

import java.util.List;

public interface UserMapper {
	public void addUser(User user);
	public User selUser(User user);
	public List<User> selAllUser(int start,int limit);
	public int selUserCount();
	public void updateUser(User user);
}

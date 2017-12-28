package com.zkx.service;

import com.zkx.pojo.User;

import java.util.List;

public interface UserService {
	public void addUser(User user);
	public User selUser(User user);
	public List<User> selAllUser(int start,int limit);
	public int selUserCount();
	public void updateUser(User user);
}

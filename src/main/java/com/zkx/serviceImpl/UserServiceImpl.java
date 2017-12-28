package com.zkx.serviceImpl;

import com.zkx.mapper.UserMapper;
import com.zkx.pojo.User;
import com.zkx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	public User selUser(User user) {
		return userMapper.selUser(user);
	}


	public List<User> selAllUser(int start,int limit) {
		return userMapper.selAllUser(start,limit);
	}

	public int selUserCount() {
		return userMapper.selUserCount();
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
}

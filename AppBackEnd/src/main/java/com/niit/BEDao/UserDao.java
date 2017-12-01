package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.User;

public interface UserDao {
	List<User> getAllUser();
	public  boolean saveUser(User user);
	public  boolean addUser(User user);
	public  boolean updateOnlineStatus(String status,User user);
	
}

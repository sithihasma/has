package com.niit.BEDao;

import java.util.List;

import com.niit.BEmodel.UserDetail;



public interface UserDao {

	public List<UserDetail> getAllUser();
	
	public boolean saveUser(UserDetail user);
	public UserDetail getUser(String username);
	public boolean updateOnlineStatus(String status,UserDetail user);
	public boolean checkLogin (UserDetail user);
	
}

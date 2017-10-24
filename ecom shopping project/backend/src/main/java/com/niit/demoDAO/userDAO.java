package com.niit.demoDAO;
import java.util.List;

import com.niit.demomodel.user;

public interface userDAO {
	public void persist(user u);
	 public user getId (int u_id);
		
		public boolean update(user u);
		public boolean delete(user u);
		
		public user  findById(int u_id);
		public List<user> getAlluser();

}


package com.niit.demoDAO;
import java.util.List;

import com.niit.demomodel.category;

public interface categoryDAO {
	public void save (category Cat);
	 public category getid (String  c_id);
	 public boolean update (category Cat);
	 public boolean delete(category c);
	public List<category> getAllcategory();
    public category findById(String c_id);
}


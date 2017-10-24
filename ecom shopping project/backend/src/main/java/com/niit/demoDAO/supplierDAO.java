package com.niit.demoDAO;
import java.util.List;


import com.niit.demomodel.supplier;

public interface supplierDAO {
	public void persist(supplier s);
	 public supplier getId (int sid);
		
		public boolean update(supplier s);
		
		public supplier  findById(int sid);
		public List<supplier> getAllsupplier();
		
	  

}


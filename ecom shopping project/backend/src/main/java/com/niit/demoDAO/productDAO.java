package com.niit.demoDAO;
import java.util.List;

import com.niit.demomodel.product;

public interface productDAO {
	 public void persist(product p);
	 public product getId (int productid);
		
		public boolean update(product p);
		
		public product  findById(int productid);
		public List<product> getAllproduct();
		
	       public boolean delete(product p);
		
}


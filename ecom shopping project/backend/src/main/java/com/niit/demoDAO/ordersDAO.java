package com.niit.demoDAO;
import java.util.List;

import com.niit.demomodel.orders;


public interface ordersDAO {
	public void  save(orders odr);
	 public orders getId (int odrid);
	 public boolean update (orders odr);
	 public  boolean  delete(orders o);
	public List<orders> getAll();
	public orders findById(int odr_id);
}

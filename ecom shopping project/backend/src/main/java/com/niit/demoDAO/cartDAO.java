package com.niit.demoDAO;
import java.util.List;

import com.niit.demomodel.cart;

public interface cartDAO {
 public void save (cart Cart);
 public cart getid (int cartid);
 public boolean update (cart Cart);
 public boolean delete(cart c);
public List<cart> getAll();
public cart findById(int cartid);
public boolean addToCart(cart c);

}

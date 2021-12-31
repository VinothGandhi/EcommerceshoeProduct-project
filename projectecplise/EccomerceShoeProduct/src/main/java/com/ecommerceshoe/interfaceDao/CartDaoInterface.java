package com.ecommerceshoe.interfaceDao;

import java.util.List;

import com.ecommerceshoe.model.cart;

public interface CartDaoInterface {
	public  int insertCart(cart carts);
	public List<cart> showCart();

}

package com.ecommerceshoe.interfaceDao;

import java.util.List;

import com.ecommerceshoe.model.Order;

public interface OrderDaoInterface {
	public  int insertOrder( Order orders);
	public List<Order> ShowOrder();
}

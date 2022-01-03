package com.ecommerceshoe.Dao;

import java.util.List;

import com.ecommerceshoe.model.Order;

public interface OrderDao {
	public  int insertOrder( Order orders);
	public List<Order> ShowOrder();
}

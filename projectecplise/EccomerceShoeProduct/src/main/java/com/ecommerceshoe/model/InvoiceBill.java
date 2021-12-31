package com.ecommerceshoe.model;

import java.util.Objects;

public class InvoiceBill {
	
	private Users user;
	private Order order;
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public InvoiceBill(Users user, Order order) {
		super();
		this.user = user;
		this.order = order;
	}
	public InvoiceBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InvoiceBill [user=" + user + ", order=" + order + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceBill other = (InvoiceBill) obj;
		return Objects.equals(order, other.order) && Objects.equals(user, other.user);
	}
	
	

}

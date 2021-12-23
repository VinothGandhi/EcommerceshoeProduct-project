package com.ecommerceshoe.model;

import java.util.Objects;

public class InvoiceBill {
	private Order order;
	private Users user;
	private Double Amount;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	public InvoiceBill(Order order, Users user, Double amount) {
		super();
		this.order = order;
		this.user = user;
		Amount = amount;
	}
	public InvoiceBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InvoiceBill [order=" + order + ", user=" + user + ", Amount=" + Amount + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Amount, order, user);
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
		return Objects.equals(Amount, other.Amount) && Objects.equals(order, other.order)
				&& Objects.equals(user, other.user);
	}
	

}

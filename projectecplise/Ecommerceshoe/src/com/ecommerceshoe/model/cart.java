 package com.ecommerceshoe.model;

import java.util.Objects;

public class cart {
	private Product product;
	private Users user;
	private String Status;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public cart(Product product, Users user, String status) {
		super();
		this.product = product;
		this.user = user;
		Status = status;
	}
	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "cart [product=" + product + ", user=" + user + ", Status=" + Status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Status, product, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cart other = (cart) obj;
		return Objects.equals(Status, other.Status) && Objects.equals(product, other.product)
				&& Objects.equals(user, other.user);
	}
	

}

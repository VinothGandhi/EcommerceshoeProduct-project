package com.ecommerceshoe.model;

import java.util.Objects;

public class Users {
	private String Name;
	private String password;
	private Long mobileNo;
	private String email;
	private String Address;
	private Double wallet;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	

	public Double getWallet() {
		return wallet;
	}

	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}

	public Users(String name, String password, Long mobileNo, String email, String address,double wallet) {
		super();
		Name = name;
		this.password = password;
		this.mobileNo = mobileNo;
		this.email = email;
		Address = address;
		this.wallet=wallet;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [Name=" + Name + ", password=" + password + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", Address=" + Address + ",wallet="+wallet+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, Name, email, mobileNo, password,wallet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(Name, other.Name)
				&& Objects.equals(email, other.email) && Objects.equals(mobileNo, other.mobileNo)
				&& Objects.equals(password, other.password)&&Objects.equals(wallet,other.wallet);
	}

}

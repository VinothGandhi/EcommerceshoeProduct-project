package com.ecommerceshoe.interfaceDao;

import com.ecommerceshoe.model.Admin;

public interface AdminDaoInterface {
	public  Admin validateAdmin(String admin_email, String password);
	public Admin AdminQuery(String admin_email, String password);

}

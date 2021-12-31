package com.ecommerceshoe.interfaceDao;

import java.util.Date;
import java.util.List;

import com.ecommerceshoe.model.Product;

public interface ProductDaoInterface {
	public  int inserproduct(String brandName, String brandType, int brandSize, String color, double prices,
			Date manufactureDate);
	public int updated(int brandSize, double prices, int productId);
	public int delete(int productId);
	public List<Product> showProduct();
	public  int findProductId(Product product);
	public  Product findProduct(String proName,String proType,int bdSize,String colorName);
	public Product findProduct(int id);
	public double findPrice(int pid);
}

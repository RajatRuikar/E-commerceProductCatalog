package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {
	public Product newProduct(Product p);
	
	public Product updateProduct(int id,Product p);
	
	public Product removerProduct(int id);
	
	public List<Product> getByProducts(int categoryId);
	
}

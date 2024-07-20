package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductRepo;
import com.model.Product;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepo pr;
	
	@Override
	public Product newProduct(Product p) {
		return pr.save(p);
	}

	@Override
	public Product updateProduct(int id, Product p) {
		Product p1 = pr.findById(id).orElse(null);
		if(p1==null) {
			return null;
		}
		p1.setProductName(p.getProductName());
		p1.setProductPrice(p.getProductPrice());
		p1.setProductRating(p.getProductRating());
		pr.save(p1);
		return p1;
	}

	@Override
	public Product removerProduct(int id) {
		Product p = pr.findById(id).orElse(null);
		if(p==null) {
			return null;
		}
		pr.delete(p);
		return p;
	}

	@Override
	public List<Product> getByProducts(int categoryId) {
		List<Product> p = pr.findByCategoryCategoryId(categoryId);
		return p;
	}

}

package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	public List<Product> findByProductCategory(String productCategory);
}

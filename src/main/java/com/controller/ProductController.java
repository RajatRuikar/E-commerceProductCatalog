package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping("/newproduct")
	public Product newProduct(@RequestBody Product p) {
		return ps.newProduct(p);
	}
	
	@PutMapping("/updateproduct/{id}")
	public Product updateProduct(@PathVariable int id, @RequestBody Product p) {
		return ps.updateProduct(id, p);
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public Product deleteProduct(@PathVariable int id) {
		return ps.removerProduct(id);
	}
	
	
	@GetMapping("/getbyproducts/{productCategory}")
	public List<Product> getByProducts(@PathVariable String productCategory) {
		return ps.getByProducts(productCategory);
	}
	
}

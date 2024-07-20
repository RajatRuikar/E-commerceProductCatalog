package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private float productPrice;
	private float productRating;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, float productPrice, float productRating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productRating = productRating;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public float getProductRating() {
		return productRating;
	}

	public void setProductRating(float productRating) {
		this.productRating = productRating;
	}

}

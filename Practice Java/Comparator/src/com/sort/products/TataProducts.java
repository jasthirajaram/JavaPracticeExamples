package com.sort.products;

public class TataProducts implements Comparable<TataProducts>{
	private int productId;
	private String productName;
	private int productPrice;
	private String productOrigin;
	
	public TataProducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TataProducts(int productId, String productName, int productPrice, String productOrigin) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductOrigin() {
		return productOrigin;
	}

	public void setProductOrigin(String productOrigin) {
		this.productOrigin = productOrigin;
	}

	@Override
	public String toString() {
		return "TataProducts [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productOrigin=" + productOrigin + "]";
	}

	@Override
	public int compareTo(TataProducts tataProducts) {
		if (this.getProductId() > tataProducts.getProductId())
			return -1;
		else
			return 1;
	}
}
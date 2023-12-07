package com.stream.demo;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private int custId;
	private String name;
	private double price;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String name, double price) {
		super();
		this.custId = custId;
		this.name = name;
		this.price = price;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", price=" + price + "]";
	}

}

public class StreamDiscount {
	public static void main(String[] args) {
		List<Customer> al = new ArrayList<>();
		al.add(new Customer(1, "Rajaram", 25654.54));
		al.add(new Customer(2, "Abhilash", 45824.54));
		al.add(new Customer(3, "Akhil", 9999.54));
		al.add(new Customer(4, "Kalyan", 15025.54));
		al.add(new Customer(5, "Goutham", 35468.54));
		al.add(new Customer(6, "Srivani", 52654.54));
		
		al.stream().filter(n -> n.getPrice() > 10000).map(m -> {
			double up = m.getPrice() * 0.9;
			m.setPrice(up);
			return m;
		}).forEach(System.out::println);
		
	//	List l=al.stream().filter(i->i.getPrice()>10000).map(j->j.getPrice()*0.9).collect(Collectors.toList());
		
	}
}

package com.sort.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortProducts {
	public static void main(String[] args) {
		List<TataProducts> list = new ArrayList<TataProducts>();
		list.add(new TataProducts(1, "Gemini", 400, "Mumbai"));
		list.add(new TataProducts(2, "Tata salt", 20, "Tamilnadu"));
		list.add(new TataProducts(3, "Tata Nexon", 1300000, "Delhi"));
		list.add(new TataProducts(4, "Tata harrior", 1800000, "Banglore"));
		list.add(new TataProducts(5, "Tata water", 20, "Hyderabad"));

		Comparator<TataProducts> comparator = new Comparator<TataProducts>() {

			@Override
			public int compare(TataProducts o1, TataProducts o2) {
				if (o1.getProductPrice() > o2.getProductPrice())
					return -1;
				else
					return 1;
			}
		};

		Comparator<TataProducts> comparator2 = new Comparator<TataProducts>() {

			@Override
			public int compare(TataProducts o1, TataProducts o2) {
				if (o1.getProductId() > o2.getProductId())
					return -1;
				else
					return 1;
			}
		};

		Collections.sort(list, comparator);
		for (TataProducts tataProducts : list) {
			System.out.println(tataProducts);
		}

		System.out.println("===============================================================");
		System.out.println("===============================================================");

		Collections.sort(list, comparator2);
		for (TataProducts tataProducts : list) {
			System.out.println(tataProducts);
		}
	}
}
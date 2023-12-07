package com.datetime.demo;

import java.time.ZoneId;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

//import com.sort.products.TataProducts;

public class DateTimeDemo {
	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		
//		LocalDate date1 = LocalDate.of(2000, Month.OCTOBER, 14);
//		System.out.println(date1);
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
//		LocalTime time1 = LocalTime.of(12, 35, 11, 999);
//		System.out.println(time1);
		
//		System.out.println(ZoneId.getAvailableZoneIds());
		
//		for (String sys : ZoneId.getAvailableZoneIds()) {
//			System.out.println(sys);
////		}
//		List<String> list = new ArrayList<>();
		Set<String> zones = new LinkedHashSet<>();
		for (String sys1 : ZoneId.getAvailableZoneIds()) {
			zones.add(sys1);
		}		
		zones.stream().sorted().forEach(System.out::println);
		System.out.println("===================================================================");
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -(o1.compareTo(o2));
			}
		};
		zones.stream().sorted(comparator).forEach(System.out::println);
		
//		List<Integer> list = new ArrayList<>();
//	    IntStream.rangeClosed(1, 1000).filter(x ->
	}
}
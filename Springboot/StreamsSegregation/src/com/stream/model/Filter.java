package com.stream.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {

	public static void main(String[] args) {

		Map<String, EmployeeModel> m = new HashMap<>();
		List<String> roles1 = new ArrayList<>(Arrays.asList("developer"));
		EmployeeModel empModel1 = new EmployeeModel("Rajaram", 1, roles1);
		m.put("r@motivitylabs.com", empModel1);

		List<String> roles2 = new ArrayList<>(Arrays.asList("admin"));
		EmployeeModel empModel2 = new EmployeeModel("Abhilash", 2, roles2);
		m.put("a@motivitytlabs.com", empModel2);

		List<String> roles3 = new ArrayList<>();
		EmployeeModel empModel3 = new EmployeeModel("Goutham", 3, roles3);
		m.put("g@motivitytlabs.com", empModel3);

		m.entrySet().stream().filter(r -> r.getValue().getRoles().size() != 0).forEach(System.out::println);
	}

}

package com.motivity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.motivity.entity.Employee;

@Configuration
public class EmployeeConfig {
	@Bean("emp1")
	public Employee createEmployee() {
		return new Employee(501, "Ballanki", "Abhilash", 789455, "KPHB Colony",25000, "Java");
	}
	@Bean("emp2")
	public Employee getEmployee1() {
		return new Employee(502, "Pujari", "Akanksha", 95562, "Balanagar",20000, "Non-Tech");
	}
	@Bean("emp3")
	public Employee getEmployee2() {
		return new Employee(503, "Bhupelli", "Akash", 75221, "GandiMaisamma",10000, "Entry level");
	}
	@Bean("emp4")
	public Employee getEmployee3() {
		return new Employee(504, "Allam", "Anil", 54545, "Warangal",33000, "GDS");
	}
	@Bean("emp5")
	public Employee getEmployee4() {
		return new Employee(505, "Gaddam", "Anil", 58878, "KPHB Colony",28000, "Java");
	}
}

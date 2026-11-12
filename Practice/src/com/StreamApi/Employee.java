package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private String name;
	private int num;
	private int sal;

	public Employee() {
	}

	public Employee(String name, int num, int sal) {
		this.name = name;
		this.num = num;
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "name : " + name + " num : " + num + " salary : " + sal;
	}

	public static void main(String args[]) {
		List<Employee> emp = Arrays.asList(new Employee("Towseef", 1, 60000), new Employee("Murari", 2, 45000),
				new Employee("saket", 3, 52000));
		emp.stream().filter(e -> e.getSal() > 50000).forEach(System.out::println);
	}

}

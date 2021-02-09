package com.faiz.Java8Practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFilterExampleWithObject {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Pankaj", 35));
		empList.add(new Employee("David", 25));
		empList.add(new Employee("Lisa", 31));
		empList.add(new Employee("Dean", 40));

		empList.stream().filter(p -> (p.getAge() > 30))
				.forEach(p -> System.out.println(p.getName() + " " + p.getAge()));

		Optional<Employee> empO = empList.stream().filter(p -> (p.getAge() > 32)).findFirst();

		if (empO.isPresent())
			System.out.println(empO.get().getName() + "," + empO.get().getAge());

	}
}

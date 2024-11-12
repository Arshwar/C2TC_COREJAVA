package com.tnsif.dayfive.hierarchicalinheritance;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Arshad", "VPM");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Arsh", "VPM", 107, 60000, "Sales Manager");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("DEV", "Pune", "FE", 90);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}

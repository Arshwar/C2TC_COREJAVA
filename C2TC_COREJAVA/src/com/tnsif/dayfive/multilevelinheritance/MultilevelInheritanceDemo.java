package com.tnsif.dayfive.multilevelinheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {

		Person p1 = new Person("Arsh", 123456789, new Date(2002, 11, 14));
		System.out.println(p1);

		p1 = new Employee("Dev", 987654321, new Date(2002, 06, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Muthu", 903243047l, new Date(2023, 15, 02), "Account", 100000, 200,
				"Signing Authority");
		System.out.println(p1);
	}

}

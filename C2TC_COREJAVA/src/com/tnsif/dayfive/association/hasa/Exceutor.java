package com.tnsif.dayfive.association.hasa;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("111 center, Center Colony", "DEVA", "AP", "111");
		Person person = new Person("Aniket", address);
		person.displayInfo();
	}
}

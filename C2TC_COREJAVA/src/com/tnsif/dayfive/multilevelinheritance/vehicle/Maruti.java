package com.tnsif.dayfive.multilevelinheritance.vehicle;

public class Maruti extends Car {
	public Maruti() {
		System.out.println("Class Maruti");
	}

	public void brand() {
		System.out.println("Brand: Suzuki");
	}
	public void speed() {
		System.out.println("Max: 150Kmph");
	}
}

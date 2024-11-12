package com.tnsif.dayeight.interfaces.markerinterfaces;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Arshad",10000,"JAVA");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}

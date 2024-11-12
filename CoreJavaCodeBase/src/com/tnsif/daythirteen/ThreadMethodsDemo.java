package com.tnsif.daythirteen;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(5, "First"); // creating child thread object
		ChildThread threadTwo = new ChildThread(10, "Second"); // creating child thread object
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread

		threadOne.start();
		threadTwo.start();
		Thread.currentThread().setName("Parent Thread");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); 
		System.out.println("Current Thread: " + Thread.currentThread());
		try {
			threadOne.join();
			threadTwo.join(300);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); 
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	}
}

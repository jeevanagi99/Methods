package com.X_workz.methods;

public class Phone {
	public static void call() {
		System.out.println("check calls list");
	}

	public static void watssup() {
		System.out.println("to see status");
	}

	public static void camer() {
		System.out.println("to take pictures");
	}

	public static void main(String[] args) {

		System.out.println("begining of method");
		Phone.camer();
		Phone.call();
		Phone.watssup();
		System.out.println("end of method");

	}

}

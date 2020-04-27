package com.company;
public class Main {
	public static void main(String[] args) {
		byte a = 25;
		Demo obj = new Demo();
		obj.show(a); // it will go to
		// byte argument
		obj.show('A'); // String
	}
}
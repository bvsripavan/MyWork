package com.pavan.practice;

public class MyFirstShort {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String strt = "Om Sai Ram";
		System.out.println(strt);
		int temp = strt.length();
		System.out.println("The length is " + temp);
		for (int i = 0; i < temp; i++) {
			System.out.println(strt);
		}

		System.out.println(MyFirstShort.Status());

		MySecondWork second = new MySecondWork();

		second.GotHere();
		
		MyThird th=new MyThird();
		
		System.out.println(th.remember());
		
		try {
			System.out.println(args[0]);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("You finished it finally");
		}
	}
	/*
	 * This is to check the Status of a method
	 */

	private static String Status() {
		return "All is Well";
	}
}

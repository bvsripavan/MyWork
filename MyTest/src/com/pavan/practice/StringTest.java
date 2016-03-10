package com.pavan.practice;

public class StringTest {

	public static void main(String[] args) {
		String newString =new String("Om Sai Ram");
		String[] newStringArray = newString.split(" ");
		try{
			for(int i=0;i<newStringArray.length;i++)
			{
				System.out.println("Entering loop for "+ i + "th time");
				System.out.println(newStringArray[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Check out my progress");
	}
}

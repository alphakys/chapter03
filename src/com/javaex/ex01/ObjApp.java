package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
		
		
		
		Object obj = new Object();
		String str = new String();
		
		
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(str));
		
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "w";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();

		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());

		
		
		String str4 = new String("b");
		String str5 = new String("b");

		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		
		
		
		System.out.println(obj.equals(obj));
		
		

		
		
		
		
		
		
		
		
		
		
		
	}


		
			@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
}

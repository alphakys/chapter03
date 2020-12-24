package com.javaex.ex05;

public class Str {

	public static void main(String[] args) {
		
		String str = "a";
		
		String str1 = "a";
		
		
		
		
		String str2 = new String("a");
		String str3 = new String("a");
		
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		String str4 =str2 + str3;
		System.out.println(str4);
		
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(str1==str2);
		
		System.out.println(str.equals("a"));
		
	}

}

package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(5,3,2,3,4,5);
		Point p1 = new Point(5,3,4,6,7,5);
		
		
		long bTime = System.nanoTime();
		System.out.println(bTime);
		
		
		System.out.println(p.equals1(p1));
		
		
		long aTime = System.nanoTime();
		System.out.println(aTime);
		
		long secDiff = (aTime - bTime)/1000;
		
		System.out.println(secDiff);
		
		
		System.out.println("==============================");
		
		long bTime1 = System.nanoTime();
		System.out.println(bTime);
		
		System.out.println();
		
		
		
		System.out.println(p.equals(p1));
		
		
		long aTime1 = System.nanoTime();
		System.out.println(aTime);
		
		long secDiff1 = (aTime1 - bTime1)/1000;
		
		System.out.println(secDiff1);
		
	
		
	
		
		//System.out.println(p.getClass());
		
		//System.out.println(p); //sys 메소드는 클래스의 toString을 출력한다.
		
	//	System.out.println(p.hashCode());
		//System.out.println(p1.hashCode());
		//System.out.println(p1);
		
		
		
		
		/*
		if()
			System.out.println("right");
		}
		else {
			System.out.println("Wrong");
		}
	
		*/
	/*	
		String str = "a";
		String str1 = "b";
		
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		
		
		String str3 = new String("a");
		String str4 = new String("a");
		
		System.out.println(str3.equals(str4));
		
		*/
		
	}



}

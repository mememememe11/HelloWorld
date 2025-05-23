package com.yedam.api;

public class StringExe {
//
//	public static void main(String[] args) {
//		String str1 = new String("Hello");
////		str1 = new String(new byte[] { 72, 101, 108, 108, 111 },0,2 );
//		
//		System.out.println(str1.charAt(1)); // "",'' 
//		System.out.println(str1.indexOf("o"));
//		
//		
//		
//	}
	
	public static void main(String[] args) {
		
		
			String subject = "자바 프로그래밍";
			char charValue = subject.charAt(3);
			
			System.out.println(charValue);
		
			String strVar1 = new String("신민철");
			
			String strVar2 = ("신민철");
			String strVar3 = ("신민철");
			
			System.out.println(strVar1 == strVar2);
			System.out.println(strVar2 == strVar3);
			
			strVar1.equals(strVar2);
			strVar2.equals(strVar3);
			System.out.println(strVar2);
			System.out.println(strVar3);
			
			String subject1 = "자바 프로그래밍";
			int length = subject1.length();
			
			System.out.println(length);
			
			
			
			
			
			
			
	}
	
	
	
	
}

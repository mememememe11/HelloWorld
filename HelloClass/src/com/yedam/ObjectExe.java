package com.yedam;

import java.util.Scanner;

public class ObjectExe {

	public static void main(String[] args) {
//		Calendar.isleap(year);
				
		
		// "2010년은 평년입니다"
		// "2000년은 윤년입니다"
		 Scanner scn = new Scanner(System.in);
		 System.out.println("년도를 입력하세요 >>>");
		 int year = Integer.parseInt(scn.nextLine());
		 boolean isLeap = false;

		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		     isLeap = true;
		 }

		 if (isLeap) {
		     System.out.println("윤년입니다");
		 } else {
		     System.out.println("평년입니다");
		 }

	}
}
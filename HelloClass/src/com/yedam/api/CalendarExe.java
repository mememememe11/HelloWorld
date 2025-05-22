package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {

		
		
//		System.out.println("        2025년 05월 ");
//		System.out.println("=============================");
//		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
//		System.out.println("=============================");
//		System.out.println("                   1   2   3");
//		System.out.println("   4   5   6   7   8   9  10");
//		System.out.println("  11  12  13  14  15  16  17");
//		System.out.println("  18  19  20  21  22  23  24");
//		System.out.println("  25  26  27  28  29  30  31");
//		System.out.println("-----------------------------");	
//		makeCalendar(2025, 5);
		
		import java.util.Calendar;

		public class CalendarExample {
		    public static void main(String[] args) {
		        printCalendar(2025, 5); // 2025년 5월 달력 출력
		    }

		    public static void printCalendar(int year, int month) {
		        Calendar cal = Calendar.getInstance();

		        // 월: 0부터 시작하므로 -1
		        cal.set(year, month - 1, 1);

		        int startDay = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일
		        int lastDate = cal.getActualMaximum(Calendar.DATE); // 말일

		        System.out.printf("       [%d년 %d월]\n", year, month);
		        System.out.println(" 일 월 화 수 목 금 토");

		        // 시작 요일 앞에 공백 출력
		        for (int i = 1; i < startDay; i++) {
		            System.out.print("   ");
		        }

		        for (int day = 1; day <= lastDate; day++) {
		            System.out.printf("%3d", day);

		            // 줄 바꿈: 토요일이면 개행
		            if ((startDay + day - 1) % 7 == 0) {
		                System.out.println();
		            }
		        }
		        System.out.println();
		    }
		}
		

	} // main end
	
	// 초기변수 선언.
			int[] dayAry = new int[365]; // 1년 365일.
			int[] lastDateAry = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월별 마지막 일자.
			int idx = 0; // 날짜를 지정할때 사용할 인덱스를 증가.
			int spaces = 4; // 월달의 공백갯수. 월마다 계산하기.

	
	
	
	
	public static void makeCalendar(int i, int j) {
		
	}

	public static void date() {	
		Date today = new Date();
		System.out.println(today.toGMTString());
		System.out.println(today.toString());

		// 생성자의 매개값으로 포멧지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년-MM월-dd일 HH시:mm분:ss초");
		String timeStr = sdf.format(today); // Date -> String
		System.out.println(timeStr);
		// 2025-05-12 13:22:38
	} 

	public static void cal() {
		// Calendar 클래스
		Calendar now = Calendar.getInstance();

		// 시간변경
		now.set(2025, 0, 1);
		now.set(Calendar.YEAR, 2024);

		// 요일
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		switch(dayOfWeek) {
			case 1: System.out.println("일요일"); break;
			case 2: System.out.println("월요일"); break;
			case 3: System.out.println("화요일"); break;
		}

		System.out.printf("년도 %d , 월: %d, 날짜: %d, 요일: %d, 말일: %d \n",
			now.get(Calendar.YEAR),
			now.get(Calendar.MONTH),
			now.get(Calendar.DATE),
			now.get(Calendar.DAY_OF_WEEK),
			now.getActualMaximum(Calendar.DATE)
		);
	} // cal end
		
	
	
} // calendar end

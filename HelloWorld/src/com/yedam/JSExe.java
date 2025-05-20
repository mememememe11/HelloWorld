package com.yedam;

import java.util.Scanner;

public class JSExe {

	public static void main(String[] args) {
//		int num1 = 30;
//		int num2 = 30;
//		System.out.println(num1 == num2);

		// String str1 = new String("Hello");
		// String str2 = new String("Hello");
		// System.out.println(str1); // Hello
		// System.out.println(str2); // Hello
//
//	        test();
//	        test2();
//	        test3();
//	        test4();
		//test5();

	}

	public static void test() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("홀수 합: " + sum);
	}

	public static void test1() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int result = (int) (Math.random() * 100) + 1;
			sum += result;
		}

		double avg = sum / 10.0; // 고침
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("test2 결과 -> 합계: " + sum + ", 평균: " + avg);
	}

	public static void test2() {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("학생 점수 입력<<");
			String value = scn.nextLine();
			int score = Integer.parseInt(value);
			sum += score;
		}

		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("test3 결과 -> 합계: " + sum + ", 평균: " + avg);

		scn.close(); // 입력 다 받았으니 닫아줌

	}

	public static void test3() {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("메시지 종료하려면 quit");
			String msg = scn.nextLine();
			if (msg.equals("quit")) {
				break;
			}
			System.out.println("입력값은" + msg);
		}
		System.out.println("end of prog");
		scn.close();
	}

	public static void test4() {
		Scanner scn = new Scanner(System.in);
		String str = "친구목록은 ";
		while (true) {
			System.out.println("친구이름을 입력. 종료하려면 quit>>");
			String msg = scn.nextLine(); // 입력값을 문자열형태로 반환

			if (msg.equals("quit")) {
				str += "입니다 ";
				break;
			}
			str += msg + ", ";

		}
		System.out.println(str);
		scn.close();
	}

	//public static void test5() {
		// printf("형식문자열", 값1, 값2...) (\ln은 줄바꿈)
		// System.out.printf("%s %.2f\t", "문자", 30.3);
		// System.out.println("");
		// "홍길동", 100, 23.9

		// System.out.printf("%s %d %.2f","홍길동",100,23.9);
		// %s가 문자열 %d가 정수 %f 실수 %.2f (2번째 소수점 까지)

		// 안녕하세요 김동원입니다
		// 나이는 20세입니다
		// 몸무게는 67.8입니다

//		String name = "김동원";
//		int age = 20;
//		double weight = 67.8;
//
//		String formatStr = "안녕하세요 %s입니다 \n";
//		formatStr += "나이는 %d세 입니다 \n";
//		formatStr += "몸무게는 %.1f입니다 \n";
//		System.out.println(formatStr);
//		String result = String.format(formatStr, name, age, weight);
//		System.out.println(result);

	}
}

package com.yedam.ref;
//실행클래스
public class CalculatorExe {
	public static void main(String[] args) {
		int a = 20, b = 30;
		
		// sum의 기능활용
		Calculator c1 = new Calculator();
		c1.sum(a,b); //정적메소드
		
		Calculator.sum(a, b);
//		CalculatorExe ce = new CalculatorExe();
//		ce.prinStar();
		
	}
	
	 static void prinStar() {
		 System.out.println("*");
	 }
}

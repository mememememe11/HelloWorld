
package com.yedam.api;

public class SystemExe {

	public static void main(String[] args) {
		// 현재시간을 정수로 반환
		

		long now = System.currentTimeMillis();
		System.out.println(now);
		// 1747964906 => "초" => 몇일,몇시간,몇분,몇초
		// 60 * 60 * 24 => 1일
		// 60 * 60 => 1시간
		// 60 => 1분
		// 나머지가 초
		//계산
		
		
		
		int a = 60, b = 24;
		long time = 1747964906;
		
			double sum =  time / (a*60);  	// 1시간
			double sum1 = time / (sum*60);	// 1일
			double sum2 = time /(sum1*24);	
			
			System.out.println(sum);
			System.out.println(sum1);
			System.out.println(sum2);
			
			
			
			
			
		
		
		
		
	}
		
	public static void exe() {
		
//		long start = System.currentTimeMillis();
//		long start = System.nanoTime();	
		int sum = 0;
		for(int i=0; i<100000000; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		long end = System.nanoTime();
//		System.out.printf("합계 %d,걸린시간 %d\n", sum , (end-start));
		
	
	}
	
	
	
}

package com.yedam.ref;

public class ArrayExe1 {
	
		
	public static void main(String[] args) {
		 //Math.random 활용해서 10 ~ 100 사이의 값을 생성 i 10번돌리기 
		 //학생 10명의 점수를 생성해서 학생점수의 평균을 구하고 최고점수 구하기
		 // 변수명 scoreAry
		
			int[] scoreAry = new int[10];
		 	int sum	= 0;
			for(int i = 1; i <=scoreAry.length; i++) {
				int student =(int)(Math.random() * 91)+10;
					sum = sum +student;
					System.out.println(student);
			}
			int avg = sum / 10;
			
			
			
	}	
//		
//		public static void test2() { 	
//		// int배열 => intAry : 10, 17, 22, 31, 55, 24
//		
//		int[] intAry = {10, 17, 22, 31, 55, 24};
//		int temp = 0;
//		// 정렬
//		for(int j=0; j<intAry.length -1; j++) {
//			for(int i=0; i < intAry.length - 1; i++) {
//				//큰값 기준으로 위치변경
//				if (intAry[i] > intAry[i + 1]) {
//					temp = intAry[i];
//					intAry[i] = intAry[i + 1];
//					intAry[i + 1] =	temp;
//		}
//		}
//		}
//		}
//			for (int i = 0; i<intAry.length; i++) {
//				System.out.printf("i: %d 값: %d\n", i, intAry[i]);
//			}
//		// 최고값 
//		int max = 0;
//		for(int i=0; i<intAry.length; i++) {
//			// max와 배열요소를 비교/ 큰값을 max에 저장
//			if (max < intAry[i]) {
//				max = intAry[i];
//			}
//			
//		}
//		System.out.printf("최대값은 %d\n", max);
//		
//		if(max !=0) {
//			return;
//		}	
//			
//		
//		// 합	
//		int sum = 0;
//		int cnt = 1;
////		for (int i = 0; i < intAry.length; i+=2) {
//		for (int i =0; i< intAry.length; i++) {
//			if(intAry[i] % 2 == 0) {
//				sum += intAry[i];
//				cnt++;
//				System.out.printf("sum: %d, i:%d, 값: %d\n", sum, i, intAry[i]);
//			}
//				double avg = 1.0 *sum / cnt;
//				System.out.printf("평균 : %.1f\n",avg);
//			
//			
//		}
//		
//	} // end of main
//	 
// // end of class
//
//			public static void test() {
//			// 3,4,5,6 중에 선택
//				
//				while(true) {
//					int num1 = (int) (Math.random()* 6) + 1;
//					int num2 = (int) (Math.random()* 6) + 1;
//					System.out.printf("(%d,%d)\n",num1 , num2);
//					if (num1 + num2 ==5) {
//						break;
//					}
//				} 
//					System.out.println("end of prog");
//				
//				for (int outer =1; outer <=4; outer++) {
//					for(int inner = 1; inner <=4; inner++ ) {
//						if(outer + inner <=5) {
//						System.out.println("*");	
//						}
//					} {
//						 System.out.println(" ");						 
//					}
//					
//				}
//					
				
}			
					
				
					
			
			
			
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
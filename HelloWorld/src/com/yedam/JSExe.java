package com.yedam;

<<<<<<< HEAD
=======
public class JSExe {
	public static void main(String[] args) {
		//home
		//변경된 부분
		//ㅠ
		//66666
		//개어렵
		//ㅈ45ㅈ4ㄷ6ㅅㄷ46ㅅ
		//임의의 수를 생성.1 ~ 100사이의 임의의 값 생성
		//1 <= x <11
		int sum = 0;
		for(int i=1; i<=5; i++) {
	int result = (int)(Math.random()* 100) + 1; // 0 <= x < 1
		sum += result;
		System.out.println("결과: " +sum);
	}	// end of main
	}
	public static void test() {
	int sum = 0;
	// 1 ~ 10 까지의 누적
	for (int i=1; i<=10; i++) {
		if(i % 2 == 1) {
			sum += i;
		}			
	}
	
	
	
		// end of test
}	
}	
------------1111111111
	////package com.yedam;
////					
//////public class JSExe {
//////
//////	public static void main(String[] args) {
////////		int num1 = 30;
////////		int num2 = 30;
////////		System.out.println(num1 == num2);
//////
////////		String str1 = new String("Hello");
////////		String str2 = new String("Hello");
////////		System.out.println(str1);
////////		System.out.println(str2);
////////
////////		// 문자열을 비교할 경우 equals 사용
////////		System.out.println(str1.equals(str2));
////////
////////		}// end of main
////////	
////////		test2(); // 평균을 구하기(소수점까지 출력)
////////
////////	public static void test(1) {
////////		int sum = 0;
////////		// 1 ~ 10 까지의 누적
////////		for (int i = 1; i <= 10; i++) {
////////		if (i % 2 == 1) {
////////				sum += i;
////////		} System.out.println(sum);
////////		}
////////		}
////////		} // end of test
////////	
////////        
////////
////////		 {
////////        //임의의 수를 생성.1 ~ 100사이의 임의의 값 생성
////////	
////////		//1<=x<11
////////		int sum = 0;
////////		for(int i = 1; i<=5; i++){
////////			int result = (int) (Math.random() * 100) + 1; // 0 <= x < 1
////////			sum += result;
////////		}  
////////			System.out.println("평균: " +sum);
////////		// end of test2
////////					
//////		
//////		//평균: 173.0*1.0/5.0 => 34.654
//////		public static void test(2) {
//////		int sum = 0;
//////		for (int i = 1; i <= 5; i++) {
//////			int result = (int) (Math.random() * 100) + 1 ; // 1부터시작 ~100 5번돌림 math random은 실수 옆에 int 정수값으로 변경
//////														   // for 문이 돌아갈때마다 sum에 합쳐짐
//////			sum += result; 
//////		}
//////		double avg = sum / 5.0;
////////		System.out.println("평균: "+ sum);
//////		avg = Math.round(avg * 100) / 100.0;
//////		
//////		System.out.println("합계:"+ sum +",평균"+ avg);
//////		
//////
////////		System.out.println(Math.round(23.678* 100) / 100.0);
//////		
//////	
//////	
//////		// end of test2.
//////		
//////		
////		
//////			
//////		
//////			
//////	}		
//////	} // end of main
////
////		public static void test3() {
////			//사용자의 입력값을 읽어들이기
////			Scanner scn;
////		}
////
//
//
//package com.yedam;
//
//import java.util.Scanner;
//
//public class JSExe {
//        // test1();
//        // test2();
//        
////    		test3();
//    
//
//    public static void test1() {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//            }
//        }
////        System.out.println("홀수 합계: " + sum);
//    }
//
//    public static void test2() {
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            int result = (int) (Math.random() * 100) + 1;
//            sum += result;
//        }
//        double avg = sum / 5.0;
//        avg = Math.round(avg * 100) / 100.0;
////        System.out.println("합계: " + sum + ", 평균: " + avg);
//    }
//
//    public static void test3() {
//    	// 사용자의 입력값을 읽어들이기
//        Scanner scn = new Scanner(System.in);  // crtl + shift + o (scanner)
//        int sum = 0;
//        for (int i=1; i<=3; i++) {
////        System.out.println("학생의 점수를 입력>>");
//        String value = scn.nextLine();   // 입력값을 문자열형태로 반환
//        int score = Integer.parseInt(value);
//        	sum += score;
//        }
//        
//        double avg = sum / 3.0;
//        avg = Math.round(avg * 100) / 100.0;
////        System.out.println("합계: " + sum + ", 평균: " + avg);
//    	}
//    
//    		
//    
//	    	
//	    public static void test4() {
//	    	
//	    	
//	    	Scanner scn = new Scanner(System.in);
//	    	while (true){
//	    		System.out.println("메시지 입력 종료하려면 quit>>");
//	    		String msg = scn.nextLine();
//	    		// equals로 비교
//	    		if(msg.equals("quit")) {
//	    			break;
//	    		}
//	    		System.out.println("입력한 값은 " + msg);
//	    		
//	    	} 
//	    	//친구목록은 홍길동, 김민규, 최석영 입니다
//	    	System.out.println("end of prog");
//	    
//	    } //end of test4
//	 
//	    
//	    public static void test5() {
//	        Scanner scn = new Scanner(System.in);
//
//	        while (true) {
//	            System.out.println("메시지 입력 종료하려면 quit>>");
//	            String msg = scn.nextLine();
//
//	            if (msg.equals("quit")) {
//	                break;
//	            }
//
//	            System.out.println("입력한 값은 " + msg);
//	        }
//
//	        System.out.println("친구목록은 홍길동, 김민규, 최석영 입니다");
//	        System.out.println("end of prog");
//
//	        scn.close(); // 입력 종료
//	    }
//	    
//
//	    
//	    
//	    
//	      //test(2) 평균 구하기 소수점까지
//		  //test(3) 스캐너 사용
//		  //test(4)
//	    
//    
//    
//    
//	    	String str = "친구목록은 ";
//	    	while (true) {
//	    		System.out.println("친구이름을 입력. 종료하려면 quit>>");
//	    	    String msg = scn.nextLine();   // 입력값을 문자열형태로 반환
//	            
//	    	    
//	    	    if (msg.equals("quit")) {
//	    	    	str += "입니다 ";
//	    	    	break;
//	    	    }
//	    	    str += msg +", ";
//	    	    
//	    		}
//	    		System.out.println(str);
//   
//	    		}
//	    		}  
//   
//    
//    
//    
//	

package com.yedam;

>>>>>>> branch 'master' of https://github.com/mememememe11/HelloWorld.git
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


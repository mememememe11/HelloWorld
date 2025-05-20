package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe {

		public static void main(String[] args) {
		
			FriendApp();
//			deleteAry();
		}
		
		public static void FriendApp() {
			Scanner scn = new Scanner(System.in);
			int sum = 0;
			String[] friendAry = new String[10];
			friendAry[0]="홍길동";
			friendAry[1]="김친구";
			friendAry[2]="김태완";
			friendAry[3]="김태희";
			
		
				
			boolean run = true;
			while (run) {
				System.out.println("1.추가 2.목록 3.삭제 4.종료");
				System.out.println("선택>> ");
				// 메뉴선택
				int menu = Integer.parseInt(scn.nextLine());
				// 
				switch(menu) {
				case 1: //추가
					
					System.out.println("추가할 친구 이름입력>> ");
					String name =scn.nextLine();
					if (name.equals("quit"));{
						
					}
					
					
					System.out.println("추가됌");
						
					
						
					//배열에 추가
				
					
					
				case 2: // 목록
					
				friendAry[0]="홍길동";
				friendAry[1]="김친구";
				friendAry[2]="김태완";
				friendAry[3]="김태희";
				
					
				
				case 3: // 삭제
					System.out.println("삭제할 친구 이름>>");
					for (int i=1; i < friendAry.length; i++) {
						if(friendAry[i] !=null && friendAry[i].equals(friendAry)){
						   friendAry[i] = null;
						}  String name1 = scn.nextLine();
						
						
						System.out.printf(name1 + "삭제되었습니다");
						break;
							
						 
						
							
						
						
					}
					
					
				case 4: // 종료
					
					 if(menu == 4) {
						System.out.println("종료 됩니다");
						break;
					} else  {
						System.out.println("1~4번중에 선택하세요");
					}	
					 System.out.println("end of prog");
					 break;
				// end of while
				}
				
			}
			
			System.out.println("end of prog");
			// end of friendApp();
			
		}
		
		
		
		public static void deleteAry() {
			Scanner scn = new Scanner(System.in);
			//배열 선언
			String[] stringAry = new String[10];
			stringAry[0] = "홍길동";
			stringAry[1] = "김친구";
			stringAry[2] = "김태완";
			stringAry[3] = "김태희";
			
			System.out.println("삭제할 친구 이름>>");
			String name = scn.nextLine();
			
			//삭제할 친구이름을 검색
			for (int i=0; i<stringAry.length; i++) {
				if(stringAry[i] !=null && stringAry[i].equals(name)) { //null이 아니라고 묻는
				   stringAry[i] = null; //삭제
				   	
				}
			}//입력값 출력
			for ( int i =0; i < stringAry.length; i++) {
				if(stringAry[i] !=null) {
				System.out.printf("stringAry[%d]번째 값: %s\n", i, stringAry[i]);
				
			}
			}
			
			System.out.println("end of prog");
			
			
			
			
		}
		
		
		
		
	
		// 문자열배열 / 배열을 사용할때는 null값을 항상 체크 null값에 넣으면 오류강제종료?당함
		
		public static void strAry() {
			Scanner scn = new Scanner(System.in);
			// 배열 선언
			String[] stringAry = new String[10];
			
			while(true) {
				System.out.println("이름을 입력>>");
				String name = scn.nextLine();
				if(name.equals("quit")) {
					break; // 밑에 while 종료
				}
				
				
				for(int i=0; i < stringAry.length; i++) {
					// 빈공간(null) 체크
					if(stringAry[i] == null) {
					   stringAry[i]	=  name;
					   System.out.println("입력성공");
					   break;
						
					}
				} // end of for
				
			} // end of while
			//입력값 출력
			for ( int i =0; i < stringAry.length; i++) {
				if(stringAry[i] !=null) {
				System.out.printf("stringAry[%d]번째 값: %s\n", i, stringAry[i]);
				
			}
			}
			
			System.out.println("end of prog");
			
			
			
			
			
			
			
			
			
		} // end of strAry
		
		
		
		
} // end of class

package com.yedam.ref.app;

import java.util.Scanner;

import com.yedam.ref.Student;

/* 
 * 회원 추가,수정,삭제,조회 기능
 1) 추가
	-아이디,이름,전화번호,포인트
	
 2) 수정	
 	- 아이디
 	- 전화번호 (바뀔항목)
 3) 삭제
 	-아이디
 4) 조회
    - 이름 (조회)
    	
*/
public class MemberExe {

	
		
	public static void main(String[] args) {
	
		boolean run = true; // 
		int members = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {		
			System.out.println("1.회원등록 2.회원수정 3.개인삭제 4.조회");	
			System.out.print("선택>> ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			int member = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) { 
				System.out.print("회원등록>> ");
							
				
				for (int i = 0; i < 3; i++) {
				System.out.printf("member[%d] 아이디>> ", i);
				String member_name = scanner.nextLine(); 
				System.out.printf("member[%d] 이름>> ", i);
				String name = scanner.nextLine();
				System.out.printf("scores[%d] 전화번호>> ", i);
				int phone_num = Integer.parseInt(scanner.nextLine());
				
				
				
				}


//				member m1 = new member();
				
				
				
				
				
				
				
				

		
		
			}
	} // while end
		
		
		
	}	// main end

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		public static void mem() {
			
		Member m1 = new Member();
		m1.member_name = "guest";
		m1.name = "김말숙";
		m1.phone_num = 010-1212-3434;
		m1.point = 0;
		
		Member m2 = new Member();
		m2.member_name = "admin";
		m2.name = "박가람";
		m2.phone_num = 010-2323-4545;
		m2.point = 0;
		
		Member m3 = new Member();
		m3.member_name = "user01";
		m3.name = "홍길동";
		m3.phone_num = 010-3434-5656;
		m3.point = 0;
		
		
		}
			
//		memAry = new member[] { m1, m2, m3 };
} // MemberExe class end
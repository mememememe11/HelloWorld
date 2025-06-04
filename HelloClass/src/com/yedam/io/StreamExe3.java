package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.yedam.Student;

/*
 * 학생(추가,수정,삭제,목록) => studentList.txt
 * add(추가: 이름,점수 입력)
 * modify(수정: 이름,점수수정)
 * remove(삭제: 이름)
 * list(목록)
 * 종료 시 저장
 * 
*/
public class StreamExe3 {
	
	static Scanner scn = new Scanner(System.in); // 정적필드
	static List<Student> studentList = new ArrayList<>(); //컬렉션
	private static String studentNo;
	
	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream is = new FileInputStream("c:/temp/original2.PNG");
			OutputStream os = new FileOutputStream("c:/temp/copy3.PNG");
			//보조스트림에 연결
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			while(true) {
				int data = bis.read(); //읽기
				if(data ==-1) {
					break;
				}
				bos.write(data);
			}
			bos.close();bis.close();
			os.close();is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			//조건
			switch(menu) {
			case 1: // 추가
				add();
				break;
			case 2: // 수정
				modify();
				break;
			case 3: //	
				
			case 5: // 종료
				run = false;
				save();
			}
		} //end of while
		System.out.println("end of prog");
	} // main end
	
	//추가
	static void add() {
			System.out.println("학생번호 : ");
			String sno = scn.nextLine();
			System.out.println("점수 : ");
			String score = scn.nextLine();
			Student student = new Student(Integer.parseInt(studentNo), Integer.parseInt(score));
			if (studentList.add(student)){
				System.out.println("저장완료");
			}
	} // add end
			
			
			
	// 저장 save();
			static void save() {
				//문자기반의 출력스트림
			
				try {
					Writer writer = new FileWriter("c:/temp/studentList.txt");
					//1001 70
				for (Student student : studentList) {
					String txt = student.getStudentNo()+ " " + student.getScore()+"\n";
					writer.write(txt); 
				}
				writer.close();
				}catch(IOException e) {
					e.printStackTrace();
				}catch (NoSuchElementException e) {
					//파일의 끝부분에서 더 이상 읽을 값이 없음
				}
				
			} // save end
			
			
		// 수정	
		static void modify() {
			System.out.print("학생번호 : ");
			String sno = scn.nextLine();
			System.out.println("점수 : ");
			String score = scn.nextLine();
			// 컬렉션에서 검색
			for (int i = 0; i < studentList.size(); i++) {
				if(studentList.get(i).getStudentNo() == sno) {
					studentList.get(i).getScore(score)
					
				}
			}
			
		} // modify end
			
			

	//초기화
	static void init() throws IOException, NoSuchElementException {
		Scanner scan = new Scanner(new File("c:/temp/studentList.txt"));
		while (true) {
		String txt = scan.nextLine();
		String[] strAry = txt.split(" "); // 1001 70
		// studentList 컬렉션에 저장 strAry[0]
			studentList.add(new student(Integer.parseInt(strAry[0],
					Integer.parseInt(strAry[1]));
		}
	} // init end
	
	}			
//class end

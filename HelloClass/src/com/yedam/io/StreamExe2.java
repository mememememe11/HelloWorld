package com.yedam.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.NoSuchElementException;
import java.util.Scanner;

// char기반의 출력스트림
// writer

public class StreamExe2 {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("c:/temp/writer.txt"));
			while(true) {
				String data = scanner.nextLine();
				// 홍길동,70
				String[] strAry = data.split(" "); // 구분자를 기준으로 배열
				System.out.println(strAry[0] +", " + strAry[1]);
				
				}
			} 
			catch (Exception e) {
//				e.printStackTrace()
			} finally{
				scanner.close();
		}
		System.out.println("end of prog");
		
	}// end of main

		
		
		
		
		
		
		
		//입력스트림
//		public static void read() {
//			//char 기반의 입력스트림
//			try {	
//				Reader reader = new FileReader("c:/temp/writer.txt");
//				while (true) {
//					int date = reader.read();
//					if (date == -1) {
//						break;
//					}
//					System.out.println((char)data);
//				}
//				}
//				reader.close();
//				catch(IOException e) {
//					e.printStackTrace();
//				}
//				
			
			
		
		
		
		
		public static void write() {
		try {	
			Writer wr = new FileWriter("c:/temp/writer.txt");
			
			wr.write('A');
			wr.write('B');
			wr.write('C');
			wr.close();	
		}catch(IOException e) {
			e.printStackTrace();
		}
			System.out.println("end of prog");
		}
	
} //end class

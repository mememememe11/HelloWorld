package com.yedam.api;



public class StringTest {
	// 실행메소드(main)
	
	public static void main(String[] args) {
		String ssn;
		// 1)성별을 반환(남성/ 여성)
		String[] samples = { "950306 1234567"//
				, "990603 2345678"//
				, "030502-3456789" };
		char gender = ssn.charAt(7);
		switch(gender) {
			case '1':
			case '3':	
				System.out.println("남성");
				break;
			case '2':
			case '4':
				System.out.println("여성");
				break;
				
		for (int i = 0; i < samples.length; i++) {
			String gender = StringUtil.getGender(samples[i]);
			System.out.printf("%s는 %s입니다.\n", samples[i], gender);
		}
			
		
		
		
		
		// lastindexOf <<<책에 없는내용임

		// 2)파일명의 확장자정보를 반환(파일확장자)
		String[] files = { "c:/temp/orange.jpg"//
				, "d:/storage/test/grape.jpeg"//
				, "d:/img/melon.png" };
		
		
		
		// 배열에 저장된 파일명에 해당하는 확장자(jpg, jpeg, png) 구하기.
		for (int i = 0; i < files.length; i++) {
			
			
			System.out.printf("파일의 확장자는 %s입니다.\n ", StringUtil.getExtName(files[i]));
		}
		
	} // end of main.

}

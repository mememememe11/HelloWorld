package com.yedam.collection.app;

public class Member {
	//필드
	
//	private String memberId;
//	private String memberName;
//	private String phone;
//	private int point;
//	
	public String memberId;
	public String memberName;
	public String phone;
	public int point;
	public int MaxPoint;
	
	//생성자
	
	
	//메소드(getter, setter)

	void Member() {
	}


	
	public Member(String memberId, String memberName, String phone, int point) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
		this.point = point;
	}



	String getMemberId() {
		return memberId;
	}



	void setMemberId(String memberId) {
		this.memberId = memberId;
	}



	String getMemberName() {
		return memberName;
	}



	void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	String getPhone() {
		return phone;
	}



	void setPhone(String phone) {
		this.phone = phone;
	}



	public int getPoint() {
		return point;
	}



	void setPoint(int point) {
		this.point = point;
		
		
	}
	//이름,연락처,포인트 출력메소드
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처 %s, 포인트 %d\n",
		memberName,phone,point);
		
	}


}









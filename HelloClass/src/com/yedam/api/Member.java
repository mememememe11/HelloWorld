package com.yedam.api;

public class Member extends Object {
	public String memberName;
	int age;
	
	public Member() {}
	public Member(String memberName,int age) {
		this.memberName = memberName;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	
	
	//이름, 점수 => 같으면 논리적 동등한지
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { //매개값의 유형이 Member 임
			Member member = (Member) obj;
			return this.memberName == member.memberName//
					&& this.age == member.age;
				
		}
		
		
		return false;
		
	}

	@Override
	public String toString() {
		return "이름: " + memberName + "나이 : " +age;
	}
}


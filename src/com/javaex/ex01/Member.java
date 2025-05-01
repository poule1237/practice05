package com.javaex.ex01;

public class Member {

	//필드
	private String name;
	private int point;
	
	
	//생성자
	public Member() {
		
	}
	public Member(String name,int point) {
		this.name = name;
		this.point = point;
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//메소드일반
	public void showInfo() {
		System.out.print("회원정보: ");
		System.out.println("이름:" + name + "," + point +"점");
		
	}
	
	
	
	
	
	
	
	
	
}

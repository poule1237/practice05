package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member();
		jws.setName("정우성(jws)");
		jws.setPoint(50000);
		
		jws.showInfo();
		
		Member yjs = new Member("유재석(yjs)",30000);
		
		yjs.showInfo();
		
		Member ihr = new Member("이효리(ihr)",40000);
		
		ihr.showInfo();
		
		
		
	}

}

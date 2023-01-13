package com.greedy.section01.method;

public class Application1 {

	public static void main(String[] args) {
		/* 메소드란?
		 * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 * */

		System.out.println("main() 시작됨...");
		
		Application1 app1 = new Application1();
		app1.methodA();
		
		System.out.println("main() 종료됨...");
		
		
	}
	
	public void methodA() {
		
		System.out.println("methodA() 호출됨...");
		
		methodB();
		
		System.out.println("methodA() 종료됨...");
	}
	
	public void methodB() {
		
		System.out.println("methodB() 호출됨...");
		
		System.out.println("methodB() 종료됨...");
		
		return;
	}
}

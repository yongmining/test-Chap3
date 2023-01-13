package com.greedy.section01.method;

public class test {

	public static void main(String[] args) {
		double yongki = 160.3;
		boolean yongface = false;
		
		double dongki = 180.5;
		boolean dongface = true;
		
		System.out.println("키가 똑같나요? : " + (yongki == dongki)); 		//같으면 true, 다르면 false
		System.out.println("똑같이 생겼나요? : " + !(yongface == dongface)); //!: 부정문을 이용한 다르면 true, 같으면 false

	}

}

package com.greedy.section01.method;

public class Calculator {
	
	public int minNumberof(int first, int second) {
		
		return (first > second)? second : first; // frist가 더크면 true 값인 second값, 반대인 경우 false 값인  first
	
	}
	public static int maxNumberof(int first, int second) {
		
		return (first > second)? first : second;
	}
}

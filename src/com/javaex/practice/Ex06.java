package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {


		//출력 예상: i=10 , n=0 
		
		int i = 10;
		int n = i++%2;
		
		System.out.println(i);
		System.out.println(n);
		
		//예상과 달랐다, n출력이 i 출력 밑에 있어서 위의 i값이 늘지 않을거라 생각했다.
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요.");
		final double pi = 3.14;
		int r = sc.nextInt();
		double pir = r*r*pi;
		
		System.out.println("원의 넓이는 "+pir);
		
		sc.close();
		
	}
} 

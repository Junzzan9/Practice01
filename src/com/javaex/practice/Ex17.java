package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		double r = sc.nextDouble();
		double pi = 3.14;
		double V = (double)4/3*pi*(r*r*r);
		
		System.out.println("구의 부피는 : "+V+" 입니다.");
		
		sc.close();
		
	

	}

}

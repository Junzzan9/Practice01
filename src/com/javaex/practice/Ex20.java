package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("500원의 개수: ");
		int x500 =sc.nextInt();
		System.out.print("100원의 개수: ");
		int x100 = sc.nextInt();
		System.out.print("50원의 개수: ");
		int x50 = sc.nextInt();
		System.out.print("10원의 개수: ");
		int x10 = sc.nextInt();
		
		System.out.println("동전의 총합은 "+((x500*500)+(x100*100)+(x50*50)+(x10*10))+
				"원 입니다.");
		
		sc.close();
		
		
		

	}

}

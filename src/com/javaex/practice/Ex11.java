package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급을 입력하세요");
		System.out.print("월급(단위 만원) : ");
		int pay = sc.nextInt();
		int save = pay*120;
		
		System.out.println("10년동안 최대 저축액은 "+save+"만원 입니다.");
		
		sc.close();
	}
}

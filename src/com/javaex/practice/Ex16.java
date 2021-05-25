package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double price = sc.nextDouble();
		
		System.out.print("받은 돈: ");
		double take = sc.nextDouble();
		
		System.out.println("============================");
		
		System.out.println("받은 돈: "+take);
		System.out.println("상품 가격: "+price);
		System.out.println("부가세: "+price*0.1);
		System.out.println("잔액: "+(take-price));
		
		sc.close();

	}

}

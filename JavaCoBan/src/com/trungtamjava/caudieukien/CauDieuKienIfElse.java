package com.trungtamjava.caudieukien;

import java.util.Scanner;

public class CauDieuKienIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap gia tri cua x: ");
		
		int x = scan.nextInt();
		if(x == 5) {
			System.out.println("x bang 5");
		}else {
			if(x > 5) {
				System.out.println("x lon hon 5");
			}else {
				System.out.println("x nho hon 5");
			}
		}
		
		System.out.println("Vui long nhap gia tri cua y");
		int y = scan.nextInt();
		if(y == 5) {
			System.out.println("y bang 5");
		}else if(x > 5) {
			System.out.println("y lon hon 5");
		}else {
			System.out.println("y nho hon 5");
		}
		System.out.println("ket thuc");
		
	}

}

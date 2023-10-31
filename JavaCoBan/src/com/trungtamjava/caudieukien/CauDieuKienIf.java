package com.trungtamjava.caudieukien;

import java.util.Scanner;

public class CauDieuKienIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap vao gia tri cua x: ");
		
		int x = scan.nextInt();
		if(x > 5) {
			System.out.println("x lon hon 5");
		}
		if(x <= 10) {
			System.out.println("x nho hon hoac bang 10");
		}
		if(x != 5) {
			System.out.println("x khac 5");
		}
		if(x == 5) {
			System.out.println("x bang 5");
		}
		
		System.out.println("Ket thuc.");
		
	}

}

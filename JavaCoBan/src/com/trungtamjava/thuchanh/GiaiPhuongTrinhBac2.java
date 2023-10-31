package com.trungtamjava.thuchanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
	public static void main(String[] args) {
		/*
		 * giai pt bac 2: ax2 + bx + c = 0; neu a = 0 => x = -c/b; neu a != 0: dental =
		 * b2 - 4ac neu dental < 0 => pt vo nghiem neu dental = 0 => x = -b/2a neu
		 * dental > 0 => x1 = (-b-can(dental))/2a; x2 = (-b + can(dental))/2a;
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap gia tri lan luot cua a, b, c");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		if (a == 0) {
			System.out.println("x = " + -c / b);
		} else {
			double dental = Math.pow(b, 2) - 4 * a * c;
			if (dental < 0) {
				System.out.println("Phuong trinh vo nghiem.");
			} else if (dental == 0) {
				System.out.println("Phuong trinh co nghiem = " + -b / (2 * a));
			} else {
				System.out.println("Phuong trinh co 2 nghiem: ");
				System.out.println("x1 = " + (-b - Math.sqrt(dental)) / 2 * a);
				System.out.println("x2 = " + (-b + Math.sqrt(dental)) / 2 * a);
			}

		}
		System.out.println("Ket thuc chuong trinh.");

	}
}

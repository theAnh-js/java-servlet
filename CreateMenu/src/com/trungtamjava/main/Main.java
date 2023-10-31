package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.hinhoc.HinhChuNhat;
import com.trungtamjava.hinhoc.HinhVuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap chon 1 hoac 2");
		System.out.println("Chon 1 de tinh chu vi va dien tich hinh vuong");
		System.out.println("Chon 2 de tinh chu vi va dien tich hinh chu nhat");

		int x = scan.nextInt();
		switch (x) {
		case 1:
			System.out.println("Ban da chon 1.");
			System.out.println("Vui long nhap gia tri cua canh hinh vuong.");
			float canh = scan.nextFloat();
			System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuVi(canh));
			System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTich(canh));
			break;
		case 2:
			System.out.println("Ban da chon 2.");
			System.out.println("Vui long nhap lan luot chieu dai va chieu rong cua hinh chu nhat.");
			float chieuDai = scan.nextFloat();
			float chieuRong = scan.nextFloat();
			System.out.println("Chu vi hinh chu nhat la: " + HinhChuNhat.chuVi(chieuDai, chieuRong));
			System.out.println("Dien tich hinh chu nhat la: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
		default:
			System.out.println("Vui long chi chon 1 hoac 2");
		}

		System.out.println("Ket thuc chuong trinh");

	}

}

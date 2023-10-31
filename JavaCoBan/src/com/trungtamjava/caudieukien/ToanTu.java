package com.trungtamjava.caudieukien;

import java.util.Scanner;

public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Toán tử ?: khác if else ở chỗ: nó ko thực hiện được code trong nó như if
		 * else. Mà chỉ có chức năng check điều kiện và gán giá trị cho biến.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap gia tri cho x: ");
		int x = scan.nextInt();
		// if else
//		if(x > 5) {
//			x = x + 1;
//		}else {
//			x = x - 1;
//		}

		// ? :
		x = (x > 5) ? (x + 1) : (x - 1);

		String s = (x > 5) ? "xin chao" : "goodbye";

		System.out.println(x);
		System.out.println(s);
	}

}

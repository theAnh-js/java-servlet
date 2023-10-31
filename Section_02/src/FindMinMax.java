import java.util.Scanner;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap a, b, c: ");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();

		if (a > b) {
			if (a > c) {
				System.out.println("a la so lon nhat");
				if (b > c) {
					System.out.println("c la so nho nhat");
				} else {
					System.out.println("b la so nho nhat");
				}
			} else if (a < c) {
				System.out.println("c la so lon nhat, b la so nho nhat");
			} else {
				System.out.println("a la so lon nhat, b la so nho nhat");
			}

		} else if (b > a) {
			if (b > c) {
				System.out.println("b la so lon nhat");
				if (a > c) {
					System.out.println("c la so nho nhat");
				} else {
					System.out.println("a la so nho nhat");
				}
			} else if (b < c) {
				System.out.println("c la so lon nhat, a la so nho nhat");
			} else {
				System.out.println("b la so lon nhat, a la so nho nhat");
			}

		} else {
			if (a > c) {
				System.out.println("a la so lon nhat, c la so nho nhat.");
			} else if (a < c) {
				System.out.println("a la so nho nhat, c la so lon nhat");
			} else {
				System.out.println("a,b,c bang nhau. Khong co min va max.");
			}
		}

	}
}

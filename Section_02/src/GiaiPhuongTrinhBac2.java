import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ax2 + bx + c = 0;
		// a = 0 => x = -c/b;
		// a != 0 => dental = b2 - 4ac;
		// dental < 0 => pt vo nghiem;
		// dental = 0 => x = -b/2a;
		// dental > 0 => x1 = (-b-can(dental))/2a, x2 = (-b + can(dental))/2a;

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap 3 tham so a, b, c: ");

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a == 0) {
			System.out.println("pt co nghiem x = " + -c / b);
		} else {
			double dental = b * b - 4 * a * c;
			if (dental < 0) {
				System.out.println("pt vo nghiem");
			} else if (dental == 0) {
				System.out.println("pt co nghiem x = " + -b / (2 * a));
			} else {
				System.out.println("pt co 2 nghiem: ");
				System.out.println("x1 = " + (-b - Math.sqrt(dental)) / 2 * a);
				System.out.println("x2 = " + (-b + Math.sqrt(dental)) / 2 * a);
			}
		}
	}

}

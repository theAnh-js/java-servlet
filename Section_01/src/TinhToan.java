
/*
 * Tạo project và tạo class TinhToan chứa các hàm tính tông, hiệu, tich, thương 
 * với overload số dương số thực.Tạo hàm main để chạy thử các hàm.
 */
public class TinhToan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myCalc(3, 5));
		System.out.println(myCalc(5f, 2f));
		System.out.println(myCalc(4.0, 5.0));
		System.out.println(myCalc(5.0, 2f));

	}

	// overload
	public static int myCalc(int a, int b) {
		return a + b;
	}

	public static float myCalc(float a, float b) {
		return a - b;
	}

	public static double myCalc(double a, double b) {
		return a * b;
	}

	public static double myCalc(double a, float b) {
		return a / b;
	}

}

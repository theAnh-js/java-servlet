
public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chuVi(2, 5);
		chuVi(2.5f, 5);
		chuVi(3.5, 6);
		chuVi(3, 4, false);
	}
	
	public static void chuVi(int a, int b) {
		int cv = (a + b) * 2;
		System.out.println(cv);
		System.out.println("ham 1");
	}
	
	//Khi muốn tận dụng cùng 1 hàm (cùng tên hàm luôn) cho nhiều
	//mục đích khác nhau (1 trong các tính chất đa hình của java).
	//ta dùng kỹ thuật overload.
	
	//Cách overload 1 là: cùng tên hàm nhưng khác kiểu dữ liệu truyền vào.
	public static void chuVi(float a, int b) {
		float cv = (a + b) * 2;
		System.out.println(cv);
		System.out.println("ham 2");
	}
	public static void chuVi(double a, int b) {
		double cv = (a + b) * 2;
		System.out.println(cv);
		System.out.println("ham 3");
	}
	
	//Cách overload 2 là: cùng tên hàm nhưng số lượng tham số truyền vào khác nhau.
	public static void chuVi(int a, int b, boolean z) {
		int cv = (a + b) * 2;
		System.out.println(cv);
		System.out.println("ham 4");
	}

}


public class HinhVuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		chuVi(x);
		
		chuVi(5);
		
		int dienTich = dienTich(x);
		System.out.println(dienTich);
	}
	
	//khai báo hàm
	public static void chuVi(int a) {
		int cv = 4 * a;
		System.out.println(cv);
		//System.out.println(dienTich(a));
		return; // trong hàm void dùng return để kết thúc hàm
				// và ko return về giá trị nào cả.
				// Sau khi return, những dòng code sau đó ko chạy được.
	}
	
	public static int dienTich(int a) { // kiểu dl của hàm phải bằng hoặc lớn 
									    // hơn kiểu dl trả về.
		int dt = a * a;
		
		return dt;
	}

}

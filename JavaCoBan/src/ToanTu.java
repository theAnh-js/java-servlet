
public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 15;
		
		int tong = x + y;
		int hieu = x - y;
		int tich = x * y;
		int thuong = x / y;
		int du = x % y;
		
		System.out.println(tong);
		System.out.println(hieu);
		System.out.println(tich);
		System.out.println(thuong);
		System.out.println(du);
		
		// số thực
		float f1 = 3.4f;
		float f2 = 4.5f;
		float tongf = f1 + f2;
		System.out.println(tongf);
		
		//nâng kiểu trong java. khi kiểu dữ liệu thấp hơn cộng với kdl cao hơn
		//thì java tự động nâng lên kiểu dữ liệu cao hơn.
		
		byte b = 4;
		short s = 67;
		int i = 100;
		long k = 400L;
		
		long tongL = k + i + s + b;
		
		int tongI = i + s + b;
		
		//int tongK = k + i + s; => error vì int thấp hơn long (biến k)
		//Trong trường hợp này t phải tự ép kiểu:
		int tongK = (int)k + i + s;
		
		double d1 = 4.5;
		double tongD = d1 + k;
		
		long tong1 = (long)d1 + k; // khi này 4.5 của d1 thành 4
		System.out.println(tong1);
		
		//phép gán;
		int t = 10;
		t = t + 5;
		System.out.println(t);
		
		t += 5;
		System.out.println(t);
		
		t -= 5;
		System.out.println(t);
		
		t /= 5;
		System.out.println(t);
		
		t *= 5;
		System.out.println(t);
		
		
		
		
		
		
	}

}

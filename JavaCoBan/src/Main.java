
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chieuDai = 3.2f;
		float chieuRong = 2f;
		float canh = 5f;
		float banKinh = 6f;
		
		System.out.println("hinh chu nhat");
		System.out.println(HinhCN.chuVi(chieuDai, chieuRong));
		System.out.println(HinhCN.dienTich(chieuDai, chieuRong));
		
		System.out.println("hinh vuong");
		System.out.println(HinhV.chuVi(canh));
		System.out.println(HinhV.dienTich(canh));
		
		System.out.println("hinh tron");
		System.out.println(HinhTron.chuVi(banKinh));
		System.out.println(HinhTron.dienTich(banKinh));
		
	}

}

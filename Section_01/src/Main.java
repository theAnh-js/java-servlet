import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Hinh Vuong
		System.out.println("Vui long nhap canh cua HINH VUONG: ");
		double canh = scan.nextDouble();
		System.out.println("Chu vi cua HINH VUONG co canh = " + canh + " la: ");
		System.out.println(HinhVuong.chuVi(canh));
		System.out.println("Dien tich cua HINH VUONG co canh = " + canh + " la: ");
		System.out.println(HinhVuong.dienTich(canh));

		// Hinh chu nhat
		System.out.println("Vui long nhap chieu dai va chieu rong cua HINH CHU NHAT: ");
		double chieuDai = scan.nextDouble();
		double chieuRong = scan.nextDouble();
		System.out.println("Chu vi cua HINH CHU NHAT la: ");
		System.out.println(HinhChuNhat.chuVi(chieuDai, chieuRong));
		System.out.println("Dien tich cua HINH CHU NHAT la: ");
		System.out.println(HinhChuNhat.dienTich(chieuDai, chieuRong));

		// Hinh tron
		System.out.println("Vui long nhap ban kinh hinh tron: ");
		double banKinh = scan.nextDouble();
		System.out.println("Chu vi hinh tron co ban kinh = " + banKinh + " la: ");
		System.out.println(HinhTron.chuVi(banKinh));
		System.out.println("Dien tich hinh tron co ban kinh = " + banKinh + " la: ");
		System.out.println(HinhTron.dienTich(banKinh));

		// Hinh tam giac vuong
		System.out.println("Vui long nhap lan luot 2 canh goc vuong va canh huyen cua tam giac: ");
		double canhGocVuong1 = scan.nextDouble();
		double canhGocVuong2 = scan.nextDouble();
		double canhHuyen = scan.nextDouble();
		System.out.println("Chu vi tam giac vuong can tim la: ");
		System.out.println(HinhTamGiacVuong.chuVi(canhGocVuong1, canhGocVuong2, canhHuyen));
		System.out.println("Dien tich tam giac vuong can tim la: ");
		System.out.println(HinhTamGiacVuong.dienTich(canhGocVuong1, canhGocVuong2, canhHuyen));

		// Sử dụng một số hàm của thư viện Math.
		// để tính toán và in ra màn hình giá trị của a = scan từ bàn phím:
		// Căn bậc 2, Bình phương,Math.Pi x a
		System.out.println("Vui long nhap vao gia tri cua a bat ky: ");
		double a = scan.nextDouble();
		System.out.println("Can bac 2 cua a la: " + Math.sqrt(a));
		System.out.println("Binh phuong cua a la: " + Math.pow(a, 2));
		System.out.println("Tich cua so Pi voi a la: " + Math.PI * a);

		// Giải phương trình bậc nhất với các tham số nhập từ bàn phím: ax + b = 0
		// với a, b nhập từ bàn phím.
		System.out.println("Vui long nhap gia tri cua a va b de giai phuong trinh bac nhat ax + b = 0 :");
		double a1 = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Ket qua cua x la: x = " + PhuongTrinhBacNhat.giaiPhuongTrinh(a1, b));
	}

}

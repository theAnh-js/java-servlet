
public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 15;
		
		int hieu = hieuHaiSo(x, y);
		System.out.println(hieu);
		System.out.println(tongHaiSo());
		
		xinChao();
		
		float chuViHinhTron = soPi() * 2;
		System.out.println(chuViHinhTron);
		
	}
	
	public static int tongHaiSo() {
		int x = 10;
		int y = 15;
		int tong = x + y;
		
		return tong;
	}
	//hàm với đối số truyền vào
	public static int hieuHaiSo(int x, int y) {
		int hieu = x - y;
		return hieu;
	}
	//hàm không có giá trị trả về;
	public static void xinChao() {
		System.out.println("Xin chao");
	}
	//hàm ko có đối số truyền vào nhưng có dữ liệu trả về;
	public static float soPi() {
		return 3.14f;
	}

}

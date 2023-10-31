
public class KieuDuLieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//So nguyen: byte, short, int, long
			//short: 16bit, mặc định là 0, -32768->32768
			//int : 32bit, mặc đinh là 0, ....
			//long: 64bit, mặc định là 0L
		 byte x = 10;
		 short s = 30;
		 int i = 3000;
		 long l = 5000000L; //chú ý với kiểu long để "L" đằng sau để p/biệt với kiểu int
		 System.out.println(x);
		 System.out.println(s);
		 System.out.println(i);
		 System.out.println(l);
		
		//Số thực: float, double
			 //float: 32bit, mặc định là 0.0f
			 //double: 64bit, mặc định là 0.0d
		 float f = 30.400f; // vs float cho thêm "f" đằng sau để pb với kiểu double;
		 double d = 4000.44;
		 System.out.println(f);
		 System.out.println(d);
		 
		 //Boolean: 1bit, true/false, mặc định là false;
		 boolean t = true;
		 boolean s1 = false;
		 System.out.println(t);
		 System.out.println(s1);
	
		 //char: 16bit unicode, dùng để lưu ký tự trong bộ nhớ.
		 char a = 'A';
		 char b = 'B';
		 System.out.println(a);
		 System.out.println(b);
		
		 
		 
		 
		 

	}

}

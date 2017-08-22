package ex01;

public class Test {
	
		public static void main(String[] args) {
		//Hello hello = new Hello();
		//hello.sayHello();
		
		//int x =5;
		//x = x++;
		
		//System.out.println(x);
		//System.out.println(y);

		int i1 = 1_000_000_000;
		int i2 = 2_000_000_000;
		// 3 miliardy wychodz¹ poza zakres int
		long i3 = i1 + i2; // ?
		System.out.println(i3);
// wynik = -1294967296
		
		//przy zmianie na long jednego operatora wynik = 3 000 000 000
		
		
		float f1 = 1.89f;
		float f2 = 592;
		float f3 = f1 * f2;
		System.out.println(f3);
		
		// wynik jest 1118.88 - dok³adny
		
		double d1 = 1.89;
		double d2 = 592;
		double d3 = d1 * d2;
		System.out.println(d3);
		
		//wynik = 1118.87999999999, mniej dok³adny
		
		
		System.out.println(4 << 1);
		System.out.println(4 << 2);
		System.out.println(-4 << 1);
		System.out.println(-4 << 2);
		System.out.println(4 >> 1);
		System.out.println(4 >> 2);
		System.out.println(-4 >> 1);
		System.out.println(-4 >> 2);
		System.out.println(1 >> 1);
		System.out.println(-1 >> 1);
		System.out.println(1 >>> 1);
		System.out.println(-1 >>> 1);
		System.out.println(~0);
		System.out.println(~-1);

		
		
		//System.out.println(x & ~x);
		//System.out.println(x | ~x);
		//System.out.println(x ^ ~x);
		//System.out.println(x + ~x);

		
		
		int x = 5;
		x += 7; // x = (int)(x + 7);
		System.out.println(x); // 12
		short s = 3;
		s -= 2.1; // s = (short)(s - 2.1);
		System.out.println(s); // 0
		int y = 7;
		y %= 3; // y = (int)(y % 3);
		System.out.println(y); // 1
		boolean b = false;
		b &= true; // b = (boolean)(b & true);
		System.out.println(b); // false

		}
		}



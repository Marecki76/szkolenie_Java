package ex04;

public class Cwicz4_3 {

	
		// maska: bit najmlodszy = 1
		// przesuwamy bity liczby w prawo
		public String toBits1(int number) {
			String s = "";
			int mask = 1;
			for (int i = 0; i < Integer.SIZE; i++) {
				char c = (number & mask) == 0 ? '0' : '1';
				number = number >> 1;
				s = c + s;
			}
			return s;
		}

		// maska: bit najmlodszy = 1
		// przesuwamy bity maski w lewo
		public String toBits2(int number) {
			String s = "";
			int mask = 1;
			for (int i = 0; i < Integer.SIZE; i++) {
				char c = (number & mask) == 0 ? '0' : '1';
				mask = mask << 1;
				s = c + s;
			}
			return s;
		}

		// maska: bit najstarszy = 1
		// przesuwamy bity maski w prawo
		public String toBits3(int number) {
			int mask = 1 << Integer.SIZE - 1;
			String s = "";
			for (int i = 0; i < Integer.SIZE; i++) {
				char c = (number & mask) == 0 ? '0' : '1';
				s += c;
				mask = mask >>> 1;
			}
			return s;
		}

		// maska: bit najstarszy = 1
		// przesuwamy bity liczby w lewo
		public String toBits4(int number) {
			int mask = 1 << Integer.SIZE - 1;
			String s = "";
			for (int i = 0; i < Integer.SIZE; i++) {
				char c = (number & mask) == 0 ? '0' : '1';
				s += c;
				number = number << 1;
			}
			return s;
		}

		public String toBits(int number) {
			String s = Integer.toString(number, 2); // 2 - uklad binarny
			return String.format("%32s", s).replace(' ', '0');
		}

		public static void main(String[] args) {
			Cwicz4_3 c = new Cwicz4_3();
			System.out.println(c.toBits1(4));
			System.out.println(c.toBits2(4));
			System.out.println(c.toBits3(4));
			System.out.println(c.toBits4(4));
			System.out.println(c.toBits(4));
		}

	}
package ex04;

public class Cwicz4_10 {

			public String code3Chars(String s, int index) {
			int[] a = new int[3];
			int i = 0;
			int l = s.length();
			do {
				a[i++] = s.charAt(index++);
				if (index >= l) {
					break;
				}
			} while (i < 3);
			int bits = (a[0] << 16) + (a[1] << 8) + a[2];
			char[] c = new char[] { '=', '=', '=', '=' };
			for (int j = 0; j < 4; j++) {
				if (i + j >= 3) {
					c[3 - j] = code(bits & 0b11_1111);
				}
				bits = bits >> 6;
			}
			return new String(c);
		}

		public char code(int x) {
			// A-Z
			if (x <= 25) {
				return (char) (x + 'A');
			}
			// a-z
			if (x <= 51) {
				return (char) (x - 26 + 'a');
			}
			// 0-9
			if (x <= 61) {
				return (char) (x - 52 + '0');
			}
			// +/
			if (x == 62) {
				return '+';
			} else {
				return '/';
			}
		}

		public static void main(String[] args) {
			Cwicz4_10 b = new Cwicz4_10();
			String s = "Ala ma kota.";
			String base = "";
			for (int i = 0, l = s.length(); i < l; i += 3) {
				base += b.code3Chars(s, i);
			}
			System.out.println(base);
		}
	}

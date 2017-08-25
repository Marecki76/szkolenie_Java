package ex09_Cwicz9_2;

public class Date {
	private int year;
	private int month;
	private int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("%4d/%02d/%02d", year, month, day);
	}

	public static Date of(String s, String separator) {
		String[] array = s.split(separator);
		if (array.length != 3) {
			return null;
		}
		int year = Integer.parseInt(array[0]);
		int month = Integer.parseInt(array[1]);
		int day = Integer.parseInt(array[2]);
		return new Date(year, month, day);
	}

	// public static Date of(String s, String separator) {
	// StringTokenizer tokenizer = new StringTokenizer(separator);
	// int i = 0;
	// String[] array = new String[3];
	// while (tokenizer.hasMoreTokens()) {
	// if (i == 3) {
	// return null;
	// }
	// array[i++] = tokenizer.nextToken();
	// }
	// int year = Integer.parseInt(array[0]);
	// int month = Integer.parseInt(array[1]);
	// int day = Integer.parseInt(array[2]);
	// return new Date(year, month, day);
	// }

	// public static Date of(String s, String separator) {
	// Scanner scanner = new Scanner(s);
	// scanner.useDelimiter(separator);
	// int year = scanner.nextInt();
	// int month = scanner.nextInt();
	// int day = scanner.nextInt();
	// scanner.close();
	// return new Date(year, month, day);
	// }

}

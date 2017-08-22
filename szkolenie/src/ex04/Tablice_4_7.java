package ex04;

import java.util.Random;

public class Tablice_4_7 {
	
	public static void main(String[] args) {
		int size = 5_000_000;
		int[] tab1 = new int [size];
		int[] tab2 = new int [size];
		
		Random r = new Random();
		
		for (int i=0; i < size; i++) {
			tab1[i] = r.nextInt(90)+ 10;
			
					
		}
		
		long start =System.nanoTime();
		for(int i=0; i<size; i++) {
			tab2[i] = tab1[i];
		}
			long stop =System.nanoTime();
			System.out.println("Kopiowanie w pêtli trwa³o " + (stop - start)/1e6 + " ms");		
			
			
			start = System.nanoTime();
			System.arraycopy(tab1, 0, tab2, 0, size);
			stop = System.nanoTime();
			System.out.println("Kopiowanie za pomoc¹ arraycopy trwa³o " + (stop - start)/1e6 + " ms");
	}
	}



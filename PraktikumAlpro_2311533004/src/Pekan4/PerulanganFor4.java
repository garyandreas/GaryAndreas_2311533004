package Pekan4;

import java.util.Scanner;

public class PerulanganFor4 {

	public static void main(String[] args) {
		int hasil = 0;
		int batas;
		
		System.out.println("Masukkan Batas = ");
		Scanner keyboard = new Scanner(System.in);
		batas = keyboard.nextInt();
		
		for (int i = 1; i <= batas; i++) {
			if (i < batas) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
			hasil = hasil + i;
		}
		System.out.println();
		System.out.println("Jumlah = " + hasil);
		keyboard.close();

	}

}

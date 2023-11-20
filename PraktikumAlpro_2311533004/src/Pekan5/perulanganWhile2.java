package Pekan5;

import java.util.Scanner;

public class perulanganWhile2 {

	public static void main(String[] args) {
		// buat variabel
		int counter = 0;
		String jawab = "Ya";
		
		// deklarasi scanner
		Scanner scan = new Scanner (System.in);
		while (!jawab.equalsIgnoreCase("tidak")) {
			counter++;
			System.out.println("Jumlah = " +counter);
			System.out.println("Apakah lanjut (Ya / Tidak)");
			jawab= scan.nextLine();
			
	}
	System.out.println("Anda sudah melakukan perulangan sebanyak " +counter+ " kali");
}


}	

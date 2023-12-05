package Pekan5;

import java.util.Scanner;

public class perulanganWhile1 {

	public static void main(String[] args) {
				// buat variabel
				int counter = 0;
				String jawab;
				boolean running = true;
				
				// deklarasi scanner
				Scanner scan = new Scanner (System.in);
				while (running) {
					counter++;
					System.out.println("Jumlah = " +counter);
					System.out.println("Apakah lanjut (Ya / Tidak)");
					jawab= scan.nextLine();
					//cek jawab = tidak, perulangan berhenti
					if (jawab.equalsIgnoreCase("TIDAK")) {
						running= false;
						
					}
			}
			System.out.println("Anda sudah melakukan perulangan sebanyak " +counter+ " kali");
		}


}	

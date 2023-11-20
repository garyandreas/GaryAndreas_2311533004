package Pekan5;

import java.util.Scanner;

public class perulanganWhile3 {

	public static void main(String[] args) {
		int umur;
		char sim;
		// deklarasi variabel
		String jawab;
		
		// deklarasi scanner
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Input umur anda : ");
			umur = scan.nextInt();
			System.out.println("Apakah Anda Sudah Punya SIM C?");
			sim = scan.next().charAt(0);
			if ((umur>=17)&&(sim=='y')) {
				System.out.println("Anda Sudah dewasa dan boleh membawa motor");
			}
			if ((umur>=17)&&(sim!='y')) {
				System.out.println("Anda sudah dewasa tetapi belum boleh membawa motor");
			
				
			}
			if((umur<17)&&(sim!='y')) {
				System.out.println("Anda belum cukup umur untuk membawa motor");
				
			}
			if((umur<17)&&(sim=='y')) {
				System.out.println("Anda belum cukup umur untuk punya SIM");
			
			}
				System.out.println("Apakah lanjut (ya / tidak)");
			jawab=scan.next();
			}
			while(!jawab.equalsIgnoreCase("tidak"));
			System.out.println("Terimakasih sudah menggunakan produk kami");
			scan.close();
	
		}
}
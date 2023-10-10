package Pekan3;

import java.util.Scanner;

public class cekUmur {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a = new Scanner(System.in);
		System.out.println("Input umur anda : ");
		umur = a.nextInt();
		System.out.println("Apakah Anda Sudah Punya SIM C?");
		sim = a.next().charAt(0);
		a.close();
			if ((umur>=17)&&(sim=='y')) {
				System.out.println("Anda Sudah dewasa dan boleh mengemudi");
			
			} else {
				System.out.println("Anda masih Anak-anak dan belum boleh mengemudi");
			}
				
			
			if(umur >= 17) {
				System.out.println("Anda Sudah dewasa");
				
			} else {
				System.out.println("Anda masih Anak-anak");
	
		}

	 }
}

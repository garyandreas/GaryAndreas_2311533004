package Pekan2;

import java.util.Scanner;

public class cekUmur {

	public static void main(String[] args) {
	int umur;
	Scanner a = new Scanner(System.in);
	System.out.println("Input umur anda : ");
	umur = a.nextInt();
	a.close();
		
		if(umur >= 17) {
			System.out.println("Anda Sudah dewasa");
			
		} else {
			System.out.println("Anda masih Anak-anak");
		}
	
	}

}
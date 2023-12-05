package Pekan5;

import java.util.Scanner;

public class perulanganWhile3 {

	public static void main(String[] args) {
		int umur;
		char sim;
		String jawab = "ya";
		
		Scanner scan = new Scanner(System.in);
		while(!jawab.equalsIgnoreCase("tidak")) {
		System.out.print("input umur anda: ");
		umur = scan.nextInt();
		
		System.out.print("apakah anda sudah mempunyai sim c: ");
		sim=scan.next().charAt(0);
		
		if ( (umur >= 17) && (sim=='y')) {
			System.out.println("anda sudah dewasa dan boleh bawa motor ");
		}
		if ( (umur >= 17) && (sim!='y')) {
			System.out.println("anda sudah dewasa tetapi belum boleh bawa motor ");
		}
		if ( (umur < 17) && (sim !='y')) {
			System.out.println("anda belum cukup umur bawa motor ");
		}
		if ( (umur < 17) && (sim =='y')) {
			System.out.println("anda belum cukup umur punya SIM ");
		}
	
		System.out.println("Apakah lanjut (ya/tidak?)");
		jawab= scan.next();
		
		}
		System.out.println("terimakasih sudah menggunakan program ini");
	    scan.close();
	
	}
}
package Pekan7;

import java.util.Scanner;

public class Razia {
	public void RaziaMotor (int a, char b){
		String jawab = "ya";
		
		Scanner scan = new Scanner(System.in);
		while(!jawab.equalsIgnoreCase("tidak")) {
		System.out.print("input umur anda: ");
		a = scan.nextInt();
		
		System.out.print("apakah anda sudah mempunyai sim c: ");
		b=scan.next().charAt(0);
		
		if ( (a >= 17) && (b=='y')) {
			System.out.println("anda sudah dewasa dan boleh bawa motor ");
		}
		if ( (a >= 17) && (b!='y')) {
			System.out.println("anda sudah dewasa tetapi belum boleh bawa motor ");
		}
		if ( (a < 17) && (b !='y')) {
			System.out.println("anda belum cukup umur bawa motor ");
		}
		if ( (a < 17) && (b =='y')) {
			System.out.println("anda belum cukup umur punya SIM ");
		}
		System.out.println("Apakah lanjut (ya/tidak?)");
		jawab= scan.next();
		}
		
		System.out.println("terimakasih sudah menggunakan program ini");
	    scan.close();
	
	}
	
}
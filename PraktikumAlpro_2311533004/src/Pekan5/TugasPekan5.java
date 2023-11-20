package Pekan5;

import java.util.Scanner;

public class TugasPekan5 {

	public static void main(String[] args) {
		
		int jumlah = 0;
		int angka = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			jumlah += angka;
			System.out.println("Inputkan angka : ");
			angka = input.nextInt();
		}while(angka >= 0);
		
		System.out.println("Sum = " +jumlah);
		input.close();
		
	}

}



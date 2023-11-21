package Pekan6;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Inputkan Pilihan Anda (1-3) : ");
		int n = in.nextInt();
		switch(n) {
		case 1:
			System.out.println("Anda Memilih Anies");
			break;
		case 2:
			System.out.println("Anda Memilih Prabowo");
			break;
		case 3:
			System.out.println("Anda Memilih Ganjar");
			break;
		default:
			System.out.println("Pilihan anda bukan nomor satu sampai 3");
		}
		System.out.println("Terimakasih sudah memilih");
		in.close();
	}

}

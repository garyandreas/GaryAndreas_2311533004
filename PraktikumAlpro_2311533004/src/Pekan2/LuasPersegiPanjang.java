package Pekan2;

import java.util.Scanner;

public class LuasPersegiPanjang {

	public static void main(String[] args) {
		int p, l, luas;
		Scanner input = new Scanner(System.in);
		System.out.print("Panjang Segi Empat = ");
		p=input.nextInt();
		System.out.print("Lebar Segi Empat = ");
		l=input.nextInt();
		luas = p * l;
		System.out.println("Luas segi empat adalah = " +luas);
		
		input.close();
		
	}

}

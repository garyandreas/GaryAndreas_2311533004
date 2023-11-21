package Pekan6;

import java.util.*;

public class Ternary {

	public static void main(String[] args) {
		Double IPK;
		Scanner cin = new Scanner (System.in);
		System.out.println("Input IPK Anda = ");
		IPK=cin.nextDouble();
		cin.close();
		String hasil = (IPK > 2.75)? "Anda lulus Sangat memuaskan":"Anda Lulus Memuaskan";
		System.out.println(hasil);
		

	}

}

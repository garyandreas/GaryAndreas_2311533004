package Pekan7;

public abstract class Method1 {

	static void ucapSalam2() {
		System.out.println("Selamat Malam!!");
	}	
	
	public static void main(String[] args) {
		Salam s1 = new Salam();
		s1.ucapanSalam();
		ucapSalam2();

	}

}

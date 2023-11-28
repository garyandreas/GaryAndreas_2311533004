package Pekan7;

public class Presensi {

	public static void main(String[] args) {
		Mahasiswa gary = new Mahasiswa();
		gary.setNim(2311533);
		gary.setNama("Gary Andreas");
		gary.Cetak();
		System.out.println(gary.getNama());
		System.out.println(gary.getNim());

	}

}
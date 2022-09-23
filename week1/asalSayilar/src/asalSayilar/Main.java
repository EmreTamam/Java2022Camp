package asalSayilar;

public class Main {

	public static void main(String[] args) {
		int number = 12;
		boolean asalMi = true;

		if (number == 1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayı");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				asalMi = false;
			}
		}

		if (asalMi) {
			System.out.println("Sayı Asaldır");
		} else {
			System.out.println("Sayı Asal Değildir");
		}

	}

}

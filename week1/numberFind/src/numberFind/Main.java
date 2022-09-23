package numberFind;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int arananSayi = 1;
		boolean varMi = false;
		
		for (int number : numbers) {
			if(number == arananSayi) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Mevcut");
		}else {
			System.out.println("Mevcut Değil");
		}

	}

}

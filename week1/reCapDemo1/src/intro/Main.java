package intro;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 32;
		int sayi2 = 27;
		int sayi3 = 22;
		int enBuyuk = sayi1;
		
		if(sayi2>enBuyuk)
		{
			enBuyuk = sayi2;
		}
		if(sayi3> enBuyuk)
		{
			enBuyuk = sayi3;
		}
		
		System.out.print(enBuyuk);

	}

}

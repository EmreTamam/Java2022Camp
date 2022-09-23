package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		
		int[] myList = {10,20,30,50,60};
		int total = 0;
		int max = myList[0];
		
		for(int number:myList) {
			if(max < number)
			{
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Sayıların Toplamı = "+total);
		System.out.println("En Büyük Sayı = "+max);

	}

}

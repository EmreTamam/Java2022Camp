package switchCase;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		switch(grade){
		case 'A':
			System.out.println("Mükemmel : Geçer");
		break;

		case 'B':
		case 'C':
			System.out.println("Çok iyi : Geçer");
		break;

		case 'D':
			System.out.println("İyi : Geçer");
		break;
		
		case 'F':
			System.out.println("Kaldınız");
		break;

	}

}
}
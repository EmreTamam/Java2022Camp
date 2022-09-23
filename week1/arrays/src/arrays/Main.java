package arrays;

public class Main {

	public static void main(String[] args) {
		String student1 = "Arım";
		String student2 = "Balım";
		String student3 = "Peteğim";
		String student4 = "Gülüm";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("------------------------");

		String[] students = new String[4];
		students[0] = "Arım";
		students[1] = "Balım";
		students[2] = "Balım";
		students[3] = "Gülüm";

		for(int i=0; i<students.length; i++){
			System.out.println(students[i]);
		}

		System.out.println("------------------------");


		for(String student:students){	

			System.out.println(student);
		}

	}

}

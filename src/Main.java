
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StudentList studList = new StudentList();

		studList.readFile("Lab3_Names.txt");
		
		//User menu
		String choice;
		String name;
		String conduct;
		Scanner sca = new Scanner(System.in);

		do {
			System.out.println("Enter 1 to change the conduct of a student");
			System.out.println("Enter 2 to sort the students' list by surname");
			System.out.println("Enter 3 to sort the students' list by age");
			System.out.println("Enter 4 to sort the students' list by phone number");
			System.out.println("Enter 5 to preview the students' list");
			System.out.println("Enter 0 to exit the program");
			choice = sca.nextLine();
			switch (choice) {
			case ("1"):
				System.out.println("Enter the name of the student. The search in not case sensitive");
				name = sca.nextLine();
				System.out.println("Enter the conduct for that student");
				conduct = sca.nextLine();
				studList.changeConduct(name, conduct);
				break;
			case ("2"):
				//Comparator interface
				Collections.sort(studList.getList(), new SortbySurname());
				break;
			case ("3"):
				//Comparable interface with overridden compareTo method
				Collections.sort(studList.getList());
				break;
			case ("4"):
				//Comparator interface
				Collections.sort(studList.getList(), new SortbyPhone());
				break;
			case ("5"):
				for (Student stud : studList.getList()) {
					System.out.println(stud);
				}
				break;
			}

		} while (!choice.equals("0"));

		sca.close();
		
		

	}

}

package grades;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grades.");
		
		int grade = 0;
		grade = input.nextInt();
		
		if (grade == 100) {
			System.out.println("A+");
		}
		else if (grade >= 90 && grade <= 99) {
			System.out.println("A");
		}
		else if (grade >= 80 && grade <= 89) {
			System.out.println("B");
		}
		else if (grade >= 70 && grade <= 79) {
			System.out.println("C");
		}
		else if (grade >= 60 && grade <= 69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}

package userInput;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a year value");
		int year=scanner.nextInt();
		scanner.nextLine();  // if we dont put this scanner program will not work.
		System.out.println("the entered year is "+year);
		
		System.out.println("enter a name value");
        String name=scanner.nextLine();
		System.out.println("the entered name is "+name+" and the age is "+(2021-year));
		scanner.close();
	}

}

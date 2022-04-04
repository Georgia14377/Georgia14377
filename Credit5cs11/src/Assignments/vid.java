package Assignments;

import java.util.Scanner;

public class vid {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter your name: "); 
		String name = userinput.next();
		
		System.out.println("Enter your password (atleast 5 characters): "); 
		String pass = userinput.next();
		
		
		while(pass.length() < 5)
		{
			System.out.println("Please re-enter a password that is 5 or more characters");
			pass = userinput.next();
		}
		System.out.println("Your name is: " + name); 
		System.out.println("Your password is:  " + pass); 

	}

}

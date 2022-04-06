package Assignments;

import java.util.Scanner;

/*

Program: assi15.java          Date: april 6th

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
public class assi17 {

	public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter your GPA or '-1' to quit: "); 
		double gpa = userinput.nextDouble();
		
		
		String haha = "";
		
		
		while(gpa != -1)
		{
		
			
			if (gpa > 3.8)
			{
				haha = "summa cum laude";
				System.out.println(haha); 
				System.out.println("Enter another GPA or '-1' to quit: "); 
				gpa = userinput.nextDouble();
			}
			else if ((gpa > 3.65) && (gpa < 3.8))
			{
				haha = "magna cum laude";
				System.out.println(haha); 
				System.out.println("Enter another GPA or '-1' to quit: "); 
				gpa = userinput.nextDouble();
			}
			else if ((gpa > 3.5) && (gpa < 3.65))
			{
				haha = "cum laude";
				System.out.println(haha); 
				System.out.println("Enter another GPA or '-1' to quit: "); 
				gpa = userinput.nextDouble();
			}
		}
		
		System.out.println("Thank you for using our program, have a great day! ");

	
	
		
	}

}
/* Screen dump
 * Enter your GPA or '-1' to quit: 
3.82
summa cum laude
Enter another GPA or '-1' to quit: 
3.7
magna cum laude
Enter another GPA or '-1' to quit: 
3.57
cum laude
Enter another GPA or '-1' to quit: 
-1
Thank you for using our program, have a great day! 
*/

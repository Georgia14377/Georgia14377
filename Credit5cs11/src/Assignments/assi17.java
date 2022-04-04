package Assignments;

import java.util.Scanner;

/*

Program: assi15.java          Date: april 4th

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
public class assi17 {

	public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter your GPA or '-1' to quit: "); 
		Double gpa = userinput.nextDouble();
		
		
		String haha = "";
		
		
		while(gpa != -1)
		{
			System.out.println("Enter your GPA or '-1' to quit: ");
			gpa = userinput.nextDouble();
			
			
			if (gpa > 3.8)
			{
				haha = "summa cum laude";
				System.out.println(haha); 
				System.out.println("Enter another GPA or '-1' to quit: "); 
				gpa = userinput.nextDouble();
			}
			else if ((gpa >364) && (gpa <3.9))
			{
				haha = "magna cum laude";
				System.out.println(haha); 
				System.out.println("Enter another GPA or '-1' to quit: "); 
				gpa = userinput.nextDouble();
			}
		}
		
		
	
	
		
	}

}

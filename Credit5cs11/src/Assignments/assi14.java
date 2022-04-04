package Assignments;
/*

Program: assi14.java          Date: april 4th

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class assi14 {

	public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter your age:"); 
	
		int age = userinput.nextInt();
		String stage = "";

		
		if (age > 17)
		{
			stage = "adult";
		}
		
		else if ((age < 18) && (age > 12 ))
		{
			stage = "teen";
		}
		
		else if ((age < 13) && (age > 9 ))
		{  
			stage = "preteen";
		}
		else if ((age < 10) && (age > 5 ))
		{  
			stage = "child";
		}
		else if (age < 6)
		{
			stage = "toddler";
		}
		
		
		System.out.println("your stage in life:  "  + stage);
	}

}

/* screen dump

Please enter your age:
3
your stage in life:  toddler



*/


package Assignments;
/*

Program: assi12.java          Date: april 1st

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class assi12 {

	public static void main(String[] args) {
		
		
Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter a grade:"); 
	
		int grade = userinput.nextInt();
		String let = "";
		
		if (grade > 90)
		{
			let = "A+";
		}
		
		else if ((grade < 90) && (grade > 79 ))
		{
			let = "A";
		}
		
		else if ((grade < 80) && (grade > 74 ))
		{
			let = "B+";
		}
		
		else if ((grade <  75) && (grade > 69 ))
		{
			let = "B";
		}
		
		else if ((grade < 70) && (grade > 64 ))
		{
			let = "C+";
		}
		else if ((grade < 65) && (grade > 59 ))
		{
			let = "C";
		}
		else if ((grade < 60) && (grade > 54 ))
		{
			let = "D+";
		}
		
		else if ((grade < 55) && (grade > 49 ))
		{
			let = "D";
		}
		else if (grade < 50)
		{
			let = "F";
		}
		
		
		System.out.println("The corresponding letter grade is:"  + let);
	}

}

/* screen dump

Please enter a grade:
87
The corresponding letter grade is:A


*/

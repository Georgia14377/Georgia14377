package Assignments;

import java.util.Scanner;

/*

Program: assi15.java          Date: april 4th

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
public class assi15 {

	public static void main(String[] args) {
	
	Scanner userinput = new Scanner(System.in);
		int ran1 = (int) (Math.random()*10);
		int ran2 = (int) (Math.random()*10);
		
		System.out.println("What is " + ran1 +  " * " + ran2 + "?"); 
	
		int ans = userinput.nextInt();
		String rans = "";
		int ran = ran1* ran2;
		
		if (ans == ran)
		{
			rans = "YOURE RIGHT!";
		}
		else 
		{
			rans = "wrong :((";
		}
		
		System.out.println( rans + "  ...the answer was:  " + ran); 
		
 
	}

}
/* screen dump

What is 7 * 2?
14
YOURE RIGHT!  ...the answer was:  14


*/


package Assignments;

import java.util.*;
public class assi7 {
	
	/*

	Program: assi7.java          Date: march 29th


	Author: Georgia Mollet
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) 
	{
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter the change:"); 
		
		int change = userinput.nextInt();
		
		int quarters = change / 25;
		
		int dimes = ((change % 25) /10); 

		int nickels = (((change % 25) %10) /5); 
		
		System.out.println("Change you provided is:" + change);
		System.out.println("quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickels: " + nickels);
		

	}

}

/* screen dump
Enter the change:
 219
Change you provided is:219
quarters: 8
dimes: 1
nickels: 1

*/


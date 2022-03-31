package Assignments;

import java.util.Scanner;
/*

Program: assi10.java          Date: march 31st


Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
public class assi10 {

	public static void main(String[] args) {
	 
Scanner userinput = new Scanner(System.in);
		
		System.out.println("enter a number:"); 
	
		
		int num1 = userinput.nextInt();

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    if ( num1 % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");

		
		System.out.println("enter a number:"); 
		
		
		
		int num2 = userinput.nextInt();
		
		
		 if ( num2 % 2 == 0 )
		        System.out.println("Entered number is even");
		     else
		        System.out.println("Entered number is odd");
		
			
		System.out.println("enter a number:"); 
		int num3 = userinput.nextInt();
		
		
		
		
		 if ( num3 % 2 == 0 )
		        System.out.println("Entered number is even");
		     else
		        System.out.println("Entered number is odd");
	}

}

/* screen dump
enter a number:
678
Entered number is even
enter a number:
 9729
Entered number is odd
enter a number:
 897283
Entered number is odd



*/

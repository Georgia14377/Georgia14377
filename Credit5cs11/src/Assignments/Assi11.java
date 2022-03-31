package Assignments;

import java.util.Scanner;

public class Assi11 {
	/*

	Program: assi10.java          Date: march 31st


	Author: Georgia Mollet
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter any three digits:"); 
	
		int dig = userinput.nextInt();
		
		int dig1 = dig / 100;
		
				
				
		int dig2 = (dig % 100) / 10;
		
		
		int dig3 = dig % 10;
		
		
		
		
		int max = 0;
		int min = 0;
		
		
		if((dig2 > dig1) && (dig3 > dig2) && (dig1 < dig3))
		{
			max = dig3;
			min = dig1;
		}
		else if((dig2 < dig1) && (dig3 > dig2) && (dig1 < dig3))
		{
			max = dig3;
			min = dig2;
		}
		else if((dig2 > dig1) && (dig2 > dig3)&& (dig1 < dig3))
		{
			max = dig2;
			min = dig1;
		}
		else if((dig2 > dig1) && (dig2 > dig3)&& (dig1 > dig3))
		{
			max = dig2;
			min = dig3;
		}
		else if((dig2 < dig1) && (dig2 > dig3)&& (dig1 > dig3))
		{
			max = dig1;
			min = dig3;
		}
		else if((dig2 < dig1) && (dig2 < dig3)&& (dig1 > dig3))
		{
			max = dig1;
			min = dig2;
		}
		
		
		int sum = dig1 + dig2 + dig3;
		int Pro = dig1 * dig2 * dig3;
		int ave = (dig1 * dig2 * dig3) / 3;
		
		
		System.out.println("Largest of the three digits: " + max); 
		System.out.println("Smallest of the three digits: " + min); 
		
		System.out.println("Sum of the three digits: " + sum ); 
		System.out.println("Product of the three digits: " + Pro); 
		System.out.println("Average of the three digits: " + ave); 
	}

}
/* screen dump

Please enter any three digits:
123
Largest of the three digits: 3
 Smallest of the three digits: 1
Sum of the three digits: 6
Product of the three digits: 6
Average of the three digits: 2

*/
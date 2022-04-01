package Assignments;

import java.text.NumberFormat;
import java.util.Scanner;

/*

Program: assi13.java          Date: april 1st


Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
public class assi13 {

	public static void main(String[] args) 
	{
Scanner userinput = new Scanner(System.in);

NumberFormat nf = NumberFormat.getInstance();
		
		System.out.println("Enter the numbers of copies to be printed:"); 
	
		int cop = userinput.nextInt();
		double cost = 0;

		
		
		if (cop < 100)
		{
			cost = 0.30; 
		}
		
		else if ((cop <500)&& (cop > 99))
		{
			cost = 0.28;
		}
		else if ((cop <750)&& (cop > 499))
		{
			cost = 0.27;
		}
		else if ((cop <1001)&& (cop > 749))
		{
			cost = 0.26;
		}
		else if (cop > 1000)
		{
			cost = 0.25;
		}
		System.out.println("Price per copy is:"  + nf.format(cost));
		System.out.println("Total cost is:"  + nf.format((cost * cop)));
	}

}

/* screen dump
Enter the numbers of copies to be printed:
234
Price per copy is:0.28
Total cost is:65.52


*/

package Assignments;
/*

Program: assi7.java          Date: march 30th


Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class assi8 {

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter a two digit number:"); 
		int number = userinput.nextInt();

		int tens = number / 10;
		System.out.println("Tens-place:" + tens); 
		int ones = (number - (tens *10));
		System.out.println("Ones-place:" + ones);
		
	}

}
/* screen dump
Enter a two digit number:
98
Tens-place:9
Ones-place:8



*/

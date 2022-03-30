package Assignments;

import java.util.Scanner;

public class assi8 {

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter a two digit nuber:"); 
		int number = userinput.nextInt();

		int tens = number / 10;
		System.out.println("Tens-place:" + tens); 
	}

}

package Assignments;
/*

Program: assi16.java          Date: april 4th

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class assi16 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
		int num = 1 +(int) (Math.random()*20);
		
		
		System.out.println("Please enter a number between 1 and 20: "); 
		
		int pnum = userinput.nextInt();
		String haha = "";
		
		
		if (num == pnum)
		{
			haha = "You Won!";
		}
		else 
		{
			haha = "Better luck next time...";
		}
		
	
		System.out.println("Computer's number is: " + pnum);
		System.out.println("Player's number is : " + num);
		System.out.println(haha);  
	}

}
/* screen dump

Please enter a number between 1 and 20: 
5
Computer's number is: 5
Player's number is : 12
Better luck next time...



*/

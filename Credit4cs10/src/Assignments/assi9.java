package Assignments;

import java.util.Scanner;

/*

Program: assi7.java          Date: march 30th


Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
public class assi9 {

	public static void main(String[] args) {
	Scanner userinput = new Scanner(System.in);
		
		System.out.println("enter a number:"); 
		int nu1 = userinput.nextInt();
		
		System.out.println("enter a second number:"); 
		int nu2 = userinput.nextInt();
		
		
		int n12 = nu1 /nu2;
		System.out.println(nu1 +" / " + nu2 + " = "  + n12); 
		int n13 = nu1 % nu2;
		System.out.println(nu1 + " % " + nu2 + "= " + n13);
		int n21 = nu2 /nu1;
		System.out.println(nu2 +" / " + nu1 + " = " + n21); 
		int n22 = nu2 % nu1;
		System.out.println( nu2 +" % "+ nu1+" = " + n22);
		
	}

}

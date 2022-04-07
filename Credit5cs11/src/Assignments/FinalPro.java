package Assignments;
/*

Program: FinalPro.java          Date: april 7th

Author: Georgia Mollet
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class FinalPro {

	public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
	
System.out.println("Would I like your pet?"); 
System.out.println("Enter '1' to start:"); 
int start = userinput.nextInt();
	
		String ani = "";
		int mine = 3 + (int) (Math.random()*10); //used later
		String name;
		
		
		 while(start == 1)
			{
			 System.out.println("What type of pet do you have?"); 
			 System.out.println("Enter '1' for Dog, '2' for Cat, '3' for Rabbit"); 
			 int type = userinput.nextInt();
			 if (type == 1)
				{
					ani = "dog";
					
				}
			 if (type == 2)
				{
					ani = "cat";
				}
			 if (type == 3)
				{
					ani = "rabbit";
				}// to use for later 
			 
			 System.out.println("Whats their name?");
			 name = userinput.next();
			 System.out.println("Wow cute name for a " + ani); 
			 // bringing back variable the user created before
			 
			 System.out.println("Do you like " + name + "?"); 
			 System.out.println("Enter '1' for Yes or '2' for No: "); 
			 int yesno = userinput.nextInt();
			 
			 if (yesno == 1)
				{
				 System.out.print("Good."); 
				}
			 else
			 {
				 System.out.println("Really? I have " + mine + " pets"
				 		+ " and i love them all"); 
			 }//using the random number generated at top (3-10)
			 
			
		 
		 
		 System.out.println(" Does " + name + " love you? "); 
		 System.out.println(" Enter '1' for Yes or '2' for No: "); 
		 int noyes = userinput.nextInt();
		 
		 if (noyes == 1)
			{
			 System.out.println("You may want to double check that..."); 
			}
		 else
		 {
			 System.out.println("Hm... i wonder why"); 
		 }
		 
		 
		 System.out.println("Enter '1' if you would like to know"
		 		+ " if i like your pet:"); 
		 int end = userinput.nextInt();
		 
		 if (end == 1)
			{
			 System.out.println("Yes i would. Why wouldn't i?"); 
			}// they all lead to the same answer
		 System.out.println("Thanks for playing!"
		 		+ " :)"); 
		 
		 System.out.println("To check another pet press '1' or press '2' to quit:"); 
		 start = userinput.nextInt();
		 // to restart or stop program
		}
	}//type.equalsIgnoreCase("CHHS")
}/*screen dump
Would I like your pet?
Enter '1' to start:
1
What type of pet do you have?
Enter '1' for Dog, '2' for Cat, '3' for Rabbit
1
Whats their name?
Bow
Wow cute name for a dog
Do you like Bow?
Enter '1' for Yes or '2' for No: 
1
Good. Does Bow love you? 
 Enter '1' for Yes or '2' for No: 
2
Hm... i wonder why
Enter '1' if you would like to know if i like your pet:
1
Yes i would. Why wouldn't i?
Thanks for playing! :)
To check another pet press '1' or press '2' to quit:
1
What type of pet do you have?
Enter '1' for Dog, '2' for Cat, '3' for Rabbit
2
Whats their name?
Tuna
Wow cute name for a cat
Do you like Tuna?
Enter '1' for Yes or '2' for No: 
2
Really? I have 12 pets and i love them all
 Does Tuna love you? 
 Enter '1' for Yes or '2' for No: 
1
You may want to double check that...
Enter '1' if you would like to know if i like your pet:
1
Yes i would. Why wouldn't i?
Thanks for playing! :)
To check another pet press '1' or press '2' to quit:
2
*/


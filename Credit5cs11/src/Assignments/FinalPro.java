package Assignments;

import java.util.Scanner;

public class FinalPro {

	public static void main(String[] args) {
Scanner userinput = new Scanner(System.in);
		
System.out.println("Would I like your pet?"); 
System.out.println("Enter '1' to start:"); 
int start = userinput.nextInt();
	
		String ani = "";
		int mine = 3 + (int) (Math.random()*10);
		String name = userinput.next();
		
		
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
				}
			 
			 System.out.println("Whats their name?");
			 name = userinput.next();
			 System.out.println("Wow cute name for a " + ani); 
			 
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
			 }
			 
			
		 
		 
		 System.out.println("Does " + name + " love you?"); 
		 System.out.println("Enter '1' for Yes or '2' for No: "); 
		 int noyes = userinput.nextInt();
		 
		 if (noyes == 1)
			{
			 System.out.println("You may want to double check that..."); 
			}
		 else
		 {
			 System.out.println("Hm... i wonder while"); 
		 }
		 
		 
		 System.out.println("Enter '1' if you would like to know"
		 		+ " if i like your pet:"); 
		 int end = userinput.nextInt();
		 
		 if (end == 1)
			{
			 System.out.println("Yes i would. Why wouldn't i?"); 
			}
		 System.out.println("Thanks for playing!"
		 		+ " :)"); 
		 
		 System.out.println("To check another pet press '1':"); 
		 start = userinput.nextInt();
		 
		}
	}//type.equalsIgnoreCase("CHHS")
}


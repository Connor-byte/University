//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 1                                    *//
//* Tutorial Task: Integer Sum                 *//          
//**********************************************//

import java.util.*;

//Declared class called IntegerSumA//
public class IntegerSumC1 {

		//Declaring static integer variables//
		private static int firstInt = 0;
		//Declared the variable for the first entered integer//
		
		private static int secondInt = 0;
		//Declared the variable for the second entered integer//
		
		private static int totalsum = 0;
		//Declared the variable to hold the sum of the integers//
		
		private static Scanner myInput;
		
		public static void main(String[] args)
		{
			myInput = new Scanner(System.in);
			
			//The next input will be stored in variable firstInt//
			firstInt = myInput.nextInt();
			
			//This will print out the first integer entered//
			System.out.println("The first integer you have entered is: " + firstInt);
			
			while (true) {
				
				//The next input will be stored in variable secondInt//
				secondInt = myInput.nextInt();
				
				//This will print out the second integer entered//
				System.out.println("The second integer you have entered is: " + secondInt);
				
				//This calculates the sum of the integers and stores it in variable totalsum//
				totalsum = firstInt + secondInt;
				
				//This will put a space between the print out for the second integer and the sum of the integers to make the output more clear//
				System.out.println();
				
				//This prints out the sum of the integers//
				System.out.println("The sum of the integers entered is: " + totalsum);
				
				//Set the firstInt to the value entered for the secondInt//
				firstInt = secondInt;
				
				//This will put a space between the print outs to make the output more clear//
				System.out.println();
				
				//This will print out the carried across integer for the user to see//
				System.out.println("Your first integer is :" + firstInt);
				
			} //Closes the while true loop section//
					
		} //Closes the static void main section//
		
} //Closes the public class IntegerSumA//

//Program end//
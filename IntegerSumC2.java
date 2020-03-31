//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 1                                    *//
//* Tutorial Task: Integer Sum                 *//          
//**********************************************//

import java.util.*;

//Declared class called IntegerSumA//
public class IntegerSumC2 
{
		//Declaring static integer variables//
		private static int firstInt = 0;
		//Declared the variable for the first entered integer//
		
		private static int secondInt = 0;
		//Declared the variable for the second entered integer//
		
		private static int thirdInt = 0;
		//Declared the variable for the third entered integer//
		
		private static int totalsum = 0;
		//Declared the variable to hold the sum of the integers//
		
		private static int temporary = 0;
		//Declared the variable to hold the order place of the integers//
		
		private static Scanner myInput;
		
		public static void main(String[] args)
		{
			
			myInput = new Scanner(System.in);
			
			while (true) {
			
				//The next input will be stored in variable firstInt//
				firstInt = myInput.nextInt();
				
				//This will print out the first integer entered//
				System.out.println("The first integer you have entered is: " + firstInt);
				
				//The next input will be stored in variable secondInt//
				secondInt = myInput.nextInt();
				
				//This will print out the second integer entered//
				System.out.println("The second integer you have entered is: " + secondInt);
				
				//The next input will be stored in variable secondInt//
				thirdInt = myInput.nextInt();
				
				//This will print out the third integer entered//
				System.out.println("The third integer you have entered is: " + thirdInt);
				
				//This calculates the sum of the integers then divides it by 3 and//
				//stores it in variable totalsum//
				totalsum = (firstInt + secondInt + thirdInt)/3;
				
				System.out.println("The average of your three entered integers is :" + totalsum);
				
				} //Closes the while true loop section//
				
		} //Closes the static void main section//
		
} //Closes the public class IntegerSumB//

//Program end//
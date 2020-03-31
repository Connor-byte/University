//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 4                                    *//
//* Tutorial Task: Course Scores               *//          
//**********************************************//

import java.util.*;

//Declaring  public class//
public class CourseStats {

	private static Scanner myInput;
	
	public static void main(String[] args) {
		
		myInput = new Scanner(System.in);
		
		//Initalising all variables required//
		int studentcount = 1;
		int passes = 0;
		int failures = 0;
		int mark;
		
		//Created while loop to ask for the results 20 times//
		while (studentcount <= 20 ) {
				
			System.out.println("Enter the given result: ");
			mark = myInput.nextInt();
			
			//If mark = 1 increases the number of passes by one//
			if (mark == 1) {
				passes = passes + 1;
			//If mark is not equal to one then add one to failures//
			} else {
				failures = failures + 1;
			}//Closes else statement//
			
			//After running once increase the counter by 1//
			studentcount = studentcount + 1;
		}//Closes while loop//
		
		//Print total number of passes and failures//
		System.out.println("Total number of passes is: " + passes);
		System.out.println("Total number of failures is: " + failures);
		
		if (passes >= 16) {
			System.out.println("Congratulations to the Tutors!");
		}//Closes if statement for passes >= 16//
	}//Closes Static void//
} //Closes public class//
//End of Project//

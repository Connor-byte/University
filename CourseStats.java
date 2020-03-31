//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 4                                    *//
//* Tutorial Task: Course Scores               *//          
//**********************************************//

import javax.swing.*;

//Declaring  public class//
public class CourseStats {

	//Creating a new OptionPane//
	public static JOptionPane entrybox = new JOptionPane();
	
	public static void main(String[] args) {
		//Initalising all variables required//
		int studentcount = 1;
		int passes = 0;
		int failures = 0;
		int mark;
		
		//Created while loop to ask for the results 20 times//
		while (studentcount <= 20 ) {
			
			//Utilised OptionPane to ask for result//
			mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the given result: "));
			
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
		
		//Displays total passes and failures in an option pane//
		JOptionPane.showMessageDialog(entrybox,  "Total Number of passes is: " + passes + "\n" + "Total Number of failures is: " + failures);
		
		//If passes is greater than or equal to 16 then prints the required message//
		if (passes >= 16) {
			System.out.println("Congratulations to the Tutors!");
		}//Closes if statement for passes >= 16//
	}//Closes static void//
} //Closes public class//
//End of Project//


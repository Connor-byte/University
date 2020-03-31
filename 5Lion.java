//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 7                                    *//
//* Tutorial Task: Animal Action               *//          
//**********************************************//

//Loads package//
package nor2.animal;

//Declares class and extends to Animal class//
public class Lion extends Animal {
	
	public Lion() {
		
		setOwner("Peter");
	}
	
	public void roar() {
		
		//Outputs required string//
		System.out.println("Roooaar!");
		
	}//End of public void roar//
	
	public void move() {
		
		//Outputs required string//
		System.out.println("Sitting");
		
	}//End of public void move//
	
	public void makeSound() {
		
		//Outputs required string//
		System.out.println("The Lion roars!");
		
	}//End of public void sound//
}//End of class Lion//
//End of project//
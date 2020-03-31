//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 6                                    *//
//* Tutorial Task: Animal Action               *//          
//**********************************************//

//Loads package//
package nor2.animal;

//Declares class and extends to Animal class//
public class Dog extends Animal {
	
	public Dog() {
		
		setOwner("Mike");
	}
	
	public void bark() {
		
		//Outputs required string//
		System.out.println("Woof!");
		
	}//End of public void bark//
	
	public void move() {
		
		//Outputs required string//
		System.out.println("Running");
		
	}//End of public void move//
	
	public void makeSound() {
		
		//Outputs required string//
		System.out.println("The dog barks!");
		
	}//End of public void sound//
}//End of class Dog//
//End of project//

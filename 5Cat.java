//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 7                                    *//
//* Tutorial Task: Animal Action               *//          
//**********************************************//

//Loads package//
package nor2.animal;



//Declares class and extends to Animal class//
public class Cat extends Animal {
	
	public Cat() {
		
		setOwner("Alice");
	}
	
	public void meow() {
		
		//Outputs required string//
		System.out.println("meooww!");
		
	}//End of public void meow//
	
	public void move() {
		
		//Outputs required string//
		System.out.println("Jumping");
		
	}//End of public void move//
	
	public void makeSound() {
		
		//Outputs required string//
		System.out.println("The cat meow!");
		
	}//End of public void sound//
}//End of class Cat//
//End of project//

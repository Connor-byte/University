//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 6                                    *//
//* Tutorial Task: Animal Action               *//          
//**********************************************//

//Loads package//
package nor.animal;

//Declares class Animal//
public abstract class Animal {
	
	public boolean isAPet = true;
	
	//Sets owner to John//
	public String owner = "John";
	
	//If sleeping print a string//
	public void sleep() {
		
		//Prints required string//
		System.out.println("Sleeping");
		
	}//closes sleep void//
	
	
	//If eating print a string//
	public void eat() {
		
		//Prints required string//
		System.out.println("Eating");
		
	}//closes eat void//
	
	public abstract void move();
	
}//End of class Animal//
//End of project//

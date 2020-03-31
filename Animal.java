//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 7                                    *//
//* Tutorial Task: Animal Action               *//          
//********************************s**************//

//Loads package//
package nor2.animal;

//Declares class Animal//
public abstract class Animal {
	
	public boolean isAPet = true;
	
	public String owner ="";
	
	//Sets owner to John//
	public String getOwner() {
		
		return owner;
	}
	
	public void setOwner(String newOwner) {
		
		owner = newOwner;
	}
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
	
	//If sound print a string//
	public void sound() {
		
		System.out.println("The animal makes the sound");
	}//closes sound void//
	
	public abstract void move();
	
}//End of class Animal//
//End of project//

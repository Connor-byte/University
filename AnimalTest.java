//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 7                                    *//
//* Tutorial Task: Animal Action               *//          
//**********************************************//

//Loads package//
package nor2.animal;

//Declares class Animal Test//
public class AnimalTest {
	
	public static void main(String[] args) {
		
		//declares name to be used in reference to sounds or actions//
		Lion lion = new Lion();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		//sound or actions loaded from extended animals//
		lion.roar();
		cat.meow();
		dog.bark();
		
		//Adds blank line to make output clearer//
		System.out.println("");
		
		//sound or actions loaded from extended animals//
		lion.sleep();
		cat.sleep();
		dog.sleep();
		
		//Adds blank line to make output clearer//
		System.out.println("");
		
		//sound or actions loaded from extended animals//
		lion.move();
		cat.move();
		dog.move();
		
		//Adds blank line to make output clearer//
		System.out.println("");
		
		//sound or actions loaded from extended animals//
		lion.makeSound();
		cat.makeSound();
		dog.makeSound();
		
		//Adds blank line to make output clearer//
		System.out.println("");
				
		//sound or actions loaded from extended animals//
		System.out.println(lion.getOwner());
		System.out.println(cat.getOwner());
		System.out.println(dog.getOwner());
		
	}//End of static void main//
}//End of class Animal Test//
//End of project//
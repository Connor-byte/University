//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 3                                    *//
//* Tutorial Task: Bank Account                *//          
//**********************************************//

import javax.swing.*;

//Declaring class Bank Account Test//
public class BankAccountTest {

	public static void main(String[] args) {

			//Declaring first account and its information//
			BankAccount firstaccount = new BankAccount (2700, "Peter");
			//Declaring second account and its information//
			BankAccount secondaccount = new BankAccount (-120, "Charlie");
			
			//Prints out the information stored in the first and second account//
			System.out.println(firstaccount.getName() + " current Bank Account balance is: " +firstaccount.getBalance());
			System.out.println(secondaccount.getName() + " current Bank Account balance is: " +secondaccount.getBalance());			  
	}//static void end//
}//Bank Account Test class close//

//Declaring class Bank Account//
class BankAccount {
	
	//This will get the name of the holder of the account//
	private String holdername;
	//This will find out how much money is currently in the bank account//
	private float balance;
	
	
	public BankAccount(float currentBalance, String currentName) {
		balance = currentBalance;
		holdername = currentName;
	}
	
	public String getName() {
		return holdername;
	}
	
	public void setName(String name) {
		this.holdername = name;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void payIn(float balance) {
		this.balance =+ balance;
	}
}//Closes Bank Account class//
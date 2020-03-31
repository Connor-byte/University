//Start of project//
//**********************************************//
//* Author: 1807192                            *//
//* Week: 3                                    *//
//* Tutorial Task: Bank Account                *//          
//**********************************************//

import javax.swing.*;

//Declaring class Bank Account Test//
public class BankAccountTest {
	//Creating new option pane//
	public static JOptionPane databox = new JOptionPane();

	public static void main(String[] args) {
		
			//Declaring first account and its information//
			BankAccount firstaccount = new BankAccount (2700, "Peter");
			//Declaring second account and its information//
			BankAccount secondaccount = new BankAccount (-120, "Charlie");
			
			//Declaring third and fourth account//
			BankAccount thirdaccount = new BankAccount();
			BankAccount fourthaccount = new BankAccount();
			
			//Prints out the information stored in the first and second account//
			System.out.println(firstaccount.getName() + " current Bank Account balance is: " +firstaccount.getBalance());
			System.out.println(secondaccount.getName() + " current Bank Account balance is: " +secondaccount.getBalance());
			
			//Displays an option pane holding the information held in the third and fourth account//
			JOptionPane.showMessageDialog(databox, "Name of holder: " + thirdaccount.getName() + " Current account balance is: " + thirdaccount.getBalance()
										  + "\n Name of holder: " + fourthaccount.getName() + " Current account balance is: " + fourthaccount.getBalance());						  
	}//static void end//
}//Bank Account Test class close//

//Declaring class Bank Account//
class BankAccount {
	
	//Declaring a static option pane//
	public static JOptionPane entrybox = new JOptionPane();
	
	//This will get the name of the holder of the account//
	private String holdername;
	//This will find out how much money is currently in the bank account//
	private float balance;
	
	public BankAccount() {
		//Sets holdername variable to hold the information entered in the option box for the user name//
		holdername = JOptionPane.showInputDialog(entrybox, "Enter account holder Name:");
		
		//Allows users to enter the balance of the account//
		String input = JOptionPane.showInputDialog(entrybox, "Enter account balance");
		
		float currentBalance = Float.valueOf(input);
		balance = currentBalance;
	}
	
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
//End of program//
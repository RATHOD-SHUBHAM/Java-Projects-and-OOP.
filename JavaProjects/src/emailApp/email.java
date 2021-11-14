package emailApp;

import java.util.Scanner;

public class email {
	
//	-----------------------------  Property -- Variables  ---------------------------------------

	//	Encapsulation - Hiding the variable from accessing
	private String FirstName;
	private String LastName;
	private String PassWord;
	private int defaultPasswordLength = 7;
	private String Department;
	private String Email;
	private int MailBoxCapacity = 500;
	private String AlternalEmail;
	private String companyName = "abc.com";
	
	
//	---------------------------  Constructor for first and last name  --------------------------------
	
	public email(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
//		System.out.println("Email Created For "+this.FirstName+" "+this.LastName);
		
		
		// Call a method for asking department and return department
		this.Department = setDepartment();
//		System.out.println("Department entered is: "+this.Department);
		
		
		// Create a method that return a password
//		this.PassWord = generatePassword(7); or
		this.PassWord = generatePassword(defaultPasswordLength);
//		System.out.println("Password is : "+this.PassWord);
		
		
		// Combine elements to create email
		Email = FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+ Department+"." + companyName;
//		System.out.println("Email is : "+Email);
	}
	
	
	
//	-------------------------------  Ask for department  -------------------------------------------

	private String setDepartment() {
		System.out.println("Enter the Department\n 1. For Sales\n 2. For Development\n 3.For Accounting\n 0.For None\n Enter Here: ");
		
		// Creating Scanner Object
		// predefined standard input object
		Scanner sc = new Scanner(System.in);
		
		int depChoice = sc.nextInt();
		
		if(depChoice == 1) {
			return "Sales";
		}
		
		else if(depChoice == 2) {
			return "Development";
		}
		
		else if (depChoice == 3) {
			return "Account";
		}
		
		else {
			return "";
		}
		
	}
	
	
//	------------------------ Generate a random password -------------------------------
	
	// int Length will say how long the password should be
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRESTUVWXYZ0123456789!@#$%^&*";
		
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
// --------------------------- This is the set method --------------------------------	

	// Change the mail box capacity
	// Encapsulation = Changing value of private variable
	public void setMailBoxCapacity(int capacity) {
		this.MailBoxCapacity = capacity;
	}
	
	
	
//	Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.AlternalEmail = altEmail;
	}
	
//	Change password
	public void changePassword(String password) {
		this.PassWord = password;
	}
	
//	----------------------- This is get method -----------------------------------------
	
	public int getMailBoxCapacity() {
		return MailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return AlternalEmail;
	}
	
	public String getPassword() {
		return PassWord;
	}
// --------------------------------  Display all the results  --------------------------------
	
	public String showInfo() {
		return "Name is: "+FirstName+" "+LastName+"\n"+
				"Department is: "+Department+"\n"+
				"Email is: "+Email+"\n"+
				"Password generated is "+PassWord+"\n"+
				"MailBox Capacity is: "+MailBoxCapacity+"MB";
	}
}

package emailApp;

public class emailapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating object for class created as email
		email emailOne = new email("JOHN","SMITH"); 
		
//		Change value of private variable  -- Set method
//		emailOne.setMailBoxCapacity(10);
//		emailOne.changePassword(null);
		
		
//		Setter and Getter working together
//		Set Method
//		emailOne.setAlternateEmail("abc.abc@Sales.abc.com");
//		Get Method
//		System.out.println("The alternate email is: "+emailOne.getAlternateEmail());
		
		String EmployeeInformation = emailOne.showInfo();
		System.out.print(EmployeeInformation);
		
		

	}

}

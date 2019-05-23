import java.util.Scanner;

public class Login {
	/*Declaration of variables*/
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailBoxCapacity = 500;
	private String companySuffix = "kishnicecompany.com";
	
	/*Constructor to receive the first and last Name*/
	public Login(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED : " +this.firstName + " " + this.lastName);
		
		/*Call a Method asking for the department; then return the department*/
		this.department = setDepartment();
		//System.out.println("Department : " + this.department);
		
		/*Call a Method that returns a Random Password*/
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " +this.password);
		
		/*Combine elements to generate email with syntax: firstname.lastname@department.company.com*/
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is : " + email);
	}
	
	/*Ask for the Department*/
	/*Setter Method*/
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + "\nDEPARTMENT CODES : \n1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nEnter the department : ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		}else if (depChoice == 2) {
			return "dev";
		}else if (depChoice == 3) {
			return "acc";
		}else {
			return "";
		}
	}
	
	/*Generate a random password*/
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	/*Set the mailbox Capacity*/
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	/*Set the alternate email*/
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	/*Change the password*/
	public void changePassword(String password) {
		this.password = password;
				
	}
	
	/*Getter Methods*/
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME : " + firstName + " " + lastName +
				"\nCOMPANY EMAIL : " + email +
				"\nMAILBOX CAPACITY : " + mailBoxCapacity + "mb";
	}
	
}

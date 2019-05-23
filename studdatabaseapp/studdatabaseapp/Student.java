package studdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String  studentId;
	private String courses = null;
	private int gradeYear;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor : prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name : ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name : ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the student's year of Study : ");
		this.gradeYear = in.nextInt();
		
		setStudentId();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
	}
	
	//Generate an ID
	//Setter Method
	public void setStudentId() {
		//Grade level + Id
		id++;
		this.studentId = gradeYear + "" + id;
		
	}
	
	//Enroll in courses
	//Setter Method
	public void setEnroll() {
		//Get inside a loop, user hits Q
		do {
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}else {
				System.out.println("BREAK!");
				break;
			}
		}
		while(1 != 0);
			{
				System.out.println("ENROLLED IN: " + courses);
				System.out.println("TUITION BALANCE: " + tuitionBalance);
			}		
		
	//View balances
		public void viewBalance() {
				System.out.println("Your Balance is: $" + tuitionBalance);
			}
	
	//Pay tuition
			public String payTuition(int payment) {
				tuitionBalance = tuitionBalance - payment;
				System.out.println("Thnak for your payment of $" + payment);
				viewBalance();
			}
	
	//Show status
	
	}
	
}

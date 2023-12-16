package preethi;
import java.util.*;
public class Student {
private String Fullname;
private int year;
private static int id = 100;
private String studentid ;
private String course = "";
private static int coursefees = 500;
private int total_fees;
private int remaing_fees;
private int pay;
 Student(){
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter Your Fullname : ");
	  Fullname = s.nextLine();
	  System.out.print("Enter Joining Year : ");
	  year = s.nextInt();
	  id++;
	  enroll();
  }
 //id
 public void get_id() {
	 studentid = year + "" + id;
	 System.out.println("id : " + studentid);
 }
 //enroll courses
 
public void enroll(){
	Scanner s2 = new Scanner(System.in);
	do { 
	
	System.out.print("Enter enroll courses | Quit: ");
	String courses = s2.nextLine();
	
	if(courses.equals("Quit")) {
		break;
	}
	else {
		course += "\n" + courses; 
		total_fees += coursefees;
	}

	}while(1!=0);
	System.out.print("Enter payment : ");
	pay = s2.nextInt();
	payment(pay);
}
public void payment(int fees) {
	remaing_fees = total_fees - fees; 
}
public void display() {
	System.out.println("Name : " + Fullname + "\n" + "Start year : " + year + "\n" + "Student id : " + studentid
			+ "\n" + "Enroll Courses : " +course + "\n" + "Total fees : " + total_fees + "\n" + "Remaing fees : " + remaing_fees );
    if(remaing_fees==0) {
    	System.out.println("Full Amount Paid");
    }
}



}
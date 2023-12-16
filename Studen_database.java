package preethi;
import java.util.*;
public class Studen_database {
  
  public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("How many students?");
	  int num = sc.nextInt();
	  Student s[] = new Student[num];
	  for(int i = 0;i<s.length ; i++) {
	  s[i] = new Student();
	  s[i].get_id();
	  s[i].display();
  }
  }
}

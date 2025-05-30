package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assigmnment {
	
	
	

	public static void main(String[] args) {
		
	 List<String> studentName = new LinkedList<String>();
	 studentName.add("Jhon Doe");
	 studentName.add("Jane smith");
	 studentName.add("Mika  Brown");
	 
	 System.out.println("Names of Student :"+studentName);
	 System.out.println("Number of student in the List :"+studentName.size());
	 System.out.println();
	 
	 List<String> studentAge = new LinkedList<String>();
	 studentAge.add("Twenty");
	 studentAge.add("Twenty one");
	 studentAge.add("Twenty two ");
	 System.out.println("Age of Student :"+studentAge);
	 System.out.println("Number of student in the List :"+studentAge.size());
	 System.out.println();
	 
	 List<String> studentGender = new ArrayList<String>();
	 studentGender.add("Male");
	 studentGender.add("Female");
	 studentGender.add("Male");
	 System.out.println("Gender of Student :"+studentGender);
	 System.out.println("Number of student in the List :"+studentGender.size());
	 System.out.println();
	 
	 Set<String> rollNo = new TreeSet<String>();
	 rollNo.add("SBA1234");
	 rollNo.add("SBA1235");
	 rollNo.add("SBA1236");
	 System.out.println("Roll No of Student :"+rollNo);
	 System.out.println("Number of student in the List :"+rollNo.size());
	 System.out.println();

	 List<String> studentGrade = new LinkedList<String>();
	 studentGrade.add("A++");
	 studentGrade.add("B+");
	 studentGrade.add("A+");
	 System.out.println("Grade of Student :"+studentGrade);
	 System.out.println("Number of student in the List :"+studentGrade.size());
	 System.out.println();
	 
	 List<String> studentMajor = new ArrayList<String>();
	 studentMajor.add("Computer Science");
	 studentMajor.add("Maths");
	 studentMajor.add("Chemistry");
	 System.out.println("Major of Student :"+studentMajor);
	 System.out.println("Number of student in the List :"+studentMajor.size());
	 System.out.println();
	 
	 Set<String> studentEmail = new TreeSet<String>();
	 studentEmail.add("JhonDoe@gmail.com");
	 studentEmail.add("Janesmith@gmail.com");
	 studentEmail.add("MikaBrown@gmail.com");
	 System.out.println("Email ID of Student :"+studentEmail);
	 System.out.println("Number of student in the List :"+studentEmail.size());
	 System.out.println();

	 Set<String> studentPanNo = new TreeSet<String>();
	 studentPanNo.add("APJ2345678");
	 studentPanNo.add("QST2345678");
	 studentPanNo.add("FPO2345678");
	 System.out.println("PAN ID of Student :"+studentPanNo);
	 System.out.println("Number of student in the List :"+studentPanNo.size());
	 System.out.println();
	 
	 List<String> studentAddress= new LinkedList<String>();
	 studentAddress.add("Sector 26 ,Delhi ");
	 studentAddress.add("Koli wada, Mumbai");
	 studentAddress.add("Baga beach, Goa");
	 System.out.println("Address of Student :"+studentAddress);
	 System.out.println("Number of student in the List :"+studentAddress.size());
	 System.out.println();
	 
	 
	 
	}

}

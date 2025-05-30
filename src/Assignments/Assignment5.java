package Assignments;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {

		// Adding all Three Students information in 3 different Hash Map(1d array)
		Map<String, String> Student1 = new HashMap<String, String>();
		Student1.put("Name", "Jhon Deo");
		Student1.put("Age", "Twenty");
		Student1.put("Gender", "Male");
		Student1.put("RollNo", "SBA1234");
		Student1.put("Grade", "A++");
		Student1.put("Major", "Computerscience");
		Student1.put("GPA", "A3.8");
		Student1.put("E-mail Id", "JhonDeo@gmail.com");
		Student1.put("PAN No.", "BAQ1234098");
		Student1.put("Address", " 123 Elm st");

		Map<String, String> Student2 = new HashMap<String, String>();
		Student2.put("Name", "Jane Smith");
		Student2.put("Age", "Twenty one");
		Student2.put("Gender", "Female");
		Student2.put("RollNo", "SBA1235");
		Student2.put("Grade", "B+");
		Student2.put("Major", "Maths");
		Student2.put("GPA", "A3.5");
		Student2.put("E-mail Id", "JaneSmith@gmail.com");
		Student2.put("PAN No.", "AQH1534898");
		Student2.put("Address", " 473 oak st");

		Map<String, String> Student3 = new HashMap<String, String>();
		Student3.put("Name", "Mike Brown");
		Student3.put("Age", "Twenty Two");
		Student3.put("Gender", "Male");
		Student3.put("RollNo", "SBA1236");
		Student3.put("Grade", "A+");
		Student3.put("Major", "Chemistry");
		Student3.put("GPA", "A3.9");
		Student3.put("E-mail Id", "Mikebrown@gmail.com");
		Student3.put("PAN No.", "HPG1534898");
		Student3.put("Address", " 789 pine st");

		// Combining all three Map in single List (2d Array)
		List<Map<String, String>> studentList = new LinkedList<Map<String, String>>();
		studentList.add(Student1);
		studentList.add(Student2);
		studentList.add(Student3);

		// Adding all Three Employee information in 3 different Hash Map(1d array)
		Map<String, String> Employee1 = new HashMap<String, String>();
		Employee1.put("Emp_Id", "E001");
		Employee1.put("Emp_Name", "Alice Green");
		Employee1.put("Age", "30");
		Employee1.put("Gender", "Female");
		Employee1.put("Department", "Enginner");
		Employee1.put("Position", "Software Engineer");
		Employee1.put("Salary ", "75K Pound");
		Employee1.put("E-mail Id", "Alice@gmail.com");
		Employee1.put("PAN No.", "BUQ1234098");

		Map<String, String> Employee2 = new HashMap<String, String>();
		Employee2.put("Emp_Id", "E002");
		Employee2.put("Emp_Name", "Bob Jhonson");
		Employee2.put("Age", "35");
		Employee2.put("Gender", "Male");
		Employee2.put("Department", "Marketing");
		Employee2.put("Position", "Marketing Manager");
		Employee2.put("Salary ", "85K Pound");
		Employee2.put("E-mail Id", "Bob@gmail.com");
		Employee2.put("PAN No.", "RTG1234098");

		Map<String, String> Employee3 = new HashMap<String, String>();
		Employee3.put("Emp_Id", "E003");
		Employee3.put("Emp_Name", "Coral White");
		Employee3.put("Age", "38");
		Employee3.put("Gender", "Female");
		Employee3.put("Department", "Sales");
		Employee3.put("Position", "Sales Executive");
		Employee3.put("Salary ", "65K Pound");
		Employee3.put("E-mail Id", "Coral@gmail.com");
		Employee3.put("PAN No.", "GHF1288098");

		List<Map<String, String>> employeeDetails = new LinkedList<Map<String, String>>();
		employeeDetails.add(Employee1);
		employeeDetails.add(Employee2);
		employeeDetails.add(Employee3);

		Map<String, String> Product1 = new HashMap<String, String>();
		Product1.put("Product Id", "P001");
		Product1.put("Name", "Laptop");
		Product1.put("Category", "Electronics");
		Product1.put("Price", "12K");
		Product1.put("Stock Quantity", "Not Available");
		Product1.put("Supplier", "Tech Supplies");
		Product1.put("Warranty", "2 years");
		Product1.put("Rating", "4.5 Stars");
		Product1.put("Manufacture Date", "Aug 2023");
		Product1.put("Expiry Date", " Aug 2028");

		Map<String, String> Product2 = new HashMap<String, String>();
		Product2.put("Product Id", "P002");
		Product2.put("Name", "Desk Chair");
		Product2.put("Category", "Furniture");
		Product2.put("Price", "15K ");
		Product2.put("Stock Quantity", "Two");
		Product2.put("Supplier", "Office Depot");
		Product2.put("Warranty", "1 Year");
		Product2.put("Rating", "4 Stars");
		Product2.put("Manufacture Date", "Dec 2024");
		Product2.put("Expiry Date", "N/A");

		Map<String, String> Product3 = new HashMap<String, String>();
		Product3.put("Product Id", "P003");
		Product3.put("Name", "Coffee Maker");
		Product3.put("Category", "Kitchen");
		Product3.put("Price", "75K");
		Product3.put("Stock Quantity", "Two Hundred");
		Product3.put("Supplier", "Kitchen World");
		Product3.put("Warranty", "6 Months");
		Product3.put("Rating", "4.2 Stars");
		Product3.put("Manufacture Date", "Jan 2025");
		Product3.put("Expiry Date", " Jan 2027");

		List<Map<String, String>> productDetails = new LinkedList<Map<String, String>>();
		productDetails.add(Product1);
		productDetails.add(Product2);
		productDetails.add(Product3);

		// combining all 3 List(Student,Employee,Product) into single Map
		Map<String, List<Map<String, String>>> combinedData = new HashMap<String, List<Map<String, String>>>();
		combinedData.put("Students", studentList);
		combinedData.put("Employees", employeeDetails);
		combinedData.put("Psroducts", productDetails);

		// Print the Office depot from Supplier details
		System.out.println(combinedData.get("Products").get(1).get("Supplier"));

	}

}

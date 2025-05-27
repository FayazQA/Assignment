package classesAndObjects;

public class EmpGroups extends Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Inheriting Employees (Parent)Class Data in EmpGroups (child)Class 
 *  */
		EmpGroups EG = new EmpGroups();
		System.out.println("Employee Names "+"           "+"Employee ID's" );
		System.out.println("Employee Name :"+"  "+EG.empName[0]+"    "+"Employee ID :"+EG.empId[0]);
		System.out.println("Employee Name :"+"  "+EG.empName[1]+"  "+"Employee ID :"+EG.empId[1]);
		System.out.println("Employee Name :"+"  "+EG.empName[2]+"     "+"Employee ID :"+EG.empId[2]);
		System.out.println("Employee Name :"+"  "+EG.empName[3]+"     "+"Employee ID :"+EG.empId[3]);

	}

}

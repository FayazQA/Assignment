package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {

		String[] empName = {"Alice Johnson","Bob smith","Coral Davis","David Green","Eva Green"};
		
		 Double[] emp1data= {75000.0, 5.1 , 4.2};
		 Double[] emp2data= {6800.0, 3.2 , 3.1};
		 Double[] emp3data= {82000.0, 7.0, 4.5};
		 Double[] emp4data= {90000.0, 10.0, 2.0};
		 Double[] emp5data= {60000.0, 2.0, 3.5};
		
		
		Map<String,Double[]> allEmpData = new HashMap<String, Double[]>();
		allEmpData.put(empName[0],emp1data);
		allEmpData.put(empName[1],emp2data);
		allEmpData.put(empName[2],emp3data);
		allEmpData.put(empName[3],emp4data);
		allEmpData.put(empName[4],emp5data);
		
		 // Map to store hike percentage
        Map<String, Double> hikeMap = new HashMap<>();
        
        for(String Employee :empName)
        	
        {
        	//getting value from map
            Double[] data = allEmpData.get(Employee); 
            double baseSalary = data[0];
            double experience = data[1];
            double rating = data[2];
            
            double variablePayPercentage;
            double bonus;
            double reward = 0;

            if (rating >= 4) {
                variablePayPercentage = 15;
                bonus = 1500;
            } else if (rating >= 3) {
                variablePayPercentage = 10;
                bonus = 1200;
            } else {
                variablePayPercentage = 3;
                bonus = 300;
            }

            // Additional reward for employees with 5+ years of experience
            if (experience >= 5) {
                reward = 5000;
            }

            // Calculating total hike amount of employee
            double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
            double hikePercentage = (hike / baseSalary) * 100;

            // Store the calculated hike percentage
            hikeMap.put(Employee, hikePercentage);
        }

        // Print hike details
        System.out.println("Employee Hike Details:");
        System.out.println(hikeMap);
        }
}
		

	



package Assignments;

public class Assignment14 {

	public static double myPow(double x, int n) {
        // Handle the case when n is zero
        if (n == 0) {
            return 1.0;
        }

        // Handle negative exponents
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = 1.0;
        double base = x;

        while (n > 0) {
            if (n % 2 == 1) {  // If n is odd
                result *= base;
            }
            base *= base;  // Square the base
            n /= 2;        // Divide n by 2
        }

        return result;
    }

	public static void main(String[] args) {
		
		 System.out.println(myPow(2.00000, 10));  // Output: 1024.00000
	        System.out.println(myPow(2.10000, 3));   // Output: 9.26100
	        System.out.println(myPow(2.00000, -2));  // Output: 0.25000

	}

}

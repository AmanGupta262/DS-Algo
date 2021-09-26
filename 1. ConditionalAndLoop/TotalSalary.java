// Total Salary
// Send Feedback
// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.
// Note: Try finding out a function on the internet to do so
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        double basicSalary = s.nextInt();
        char grade = s.next().charAt(0);
        double hra = basicSalary * .2;
        double da = basicSalary * .5;
        
        double allow = 1300;
        if(grade == 'A')
            allow = 1700;
        else if(grade == 'B')
            allow = 1500;
        
        double pf = basicSalary * .11;
        
        double totalSalary = basicSalary + hra + da + allow - pf;
        
        System.out.println(Math.round(totalSalary));

	}
}
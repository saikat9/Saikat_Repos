package SampleEmployee;

import java.util.Scanner;

public class SampleEmpMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int EmpId = scan.nextInt();
		SampleEmp Emp = new SampleEmp();
		Emp.setEmpId(EmpId);
		System.out.println("Employee Salary is:"+ Emp.CalSalary());
		scan.close();

	}

}

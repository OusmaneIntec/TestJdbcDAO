package dakplusplus.view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dakplusplus.model.Employee;
import dakplusplus.service.EmployeeService;

public class EmployeeView {
	private static EmployeeService employeeService = new EmployeeService();

	public static void showAllEmployees() {

		try {
			List<Employee> employees = employeeService.findAllEmployee();
			employees.forEach(System.out::println);

		} catch (SQLException e) {
			System.out.println("Something wrong with the db..");
			// e.printStackTrace(); }

		}

	}

	public static void EditEmployee() {
		try {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Editing an employee");
			System.out.println("Enter the employee id");
			int id= sc.nextInt();
			System.out.println("Enter the first name");
			String fn=sc.next();
			System.out.println("Enter the the last name");
			String ln=sc.next();
			System.out.println("Enter the phone number");
			String phoneNum=sc.next();
			System.out.println("Enter the emergency number");
			String ephoneNum=sc.next();
			System.out.println("Enter the birth of date (YYYY-MM-DD)");
			String birthOfDate=sc.next();
			System.out.println("Enter the salary");
			double salary=sc.nextDouble();
			
			Employee employee = new Employee(id,fn,ln,phoneNum,ephoneNum, ViewTools.parseStringToLocalDate(birthOfDate),salary);
			employeeService.modifiyEmployee(employee);
		} catch (SQLException e) {
			System.out.println("Something wrong with the db..");
			e.printStackTrace();
		}
	}

	public static void deleteEmployee() {
		try {
			employeeService.deleteById(1);
		} catch (SQLException e1) {
			System.out.println("Something wrong with the db...");
			 e1.printStackTrace();

		}
	}
    public static void addEmployee() {
    	 try { 
    		 Scanner sc=new Scanner(System.in);
 			
 			System.out.println("Adding an employee");
 			System.out.println("Enter the first name");
 			String fn=sc.next();
 			sc.next();
 			System.out.println("Enter the the last name");
 			String ln=sc.next();
 			System.out.println("Enter the phone number");
 			String phoneNum=sc.next();
 			System.out.println("Enter the emergency number");
 			String ephoneNum=sc.next();
 			System.out.println("Enter the birth of date (YYYY-MM-DD)");
 			String birthOfDate=sc.next();
 			System.out.println("Enter the salary");
 			double salary=sc.nextDouble();
 			Employee employee = new Employee(fn,ln,phoneNum,ephoneNum, ViewTools.parseStringToLocalDate(birthOfDate),salary);
		 employeeService.addEmployee(employee);
		 } catch (SQLException e) {
			 System.out.println("Something wrong with the db..");
			 e.printStackTrace(); 
	 }
    }
    public static void showEmployeeBithDay() {
    	LocalDate today=LocalDate.now();
    	try {
			List<Employee> employees= employeeService.showEmployeeBithDay(today);
			employees.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}

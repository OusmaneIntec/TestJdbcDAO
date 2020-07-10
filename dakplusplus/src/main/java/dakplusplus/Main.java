package dakplusplus;

import java.sql.Connection;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import dakplusplus.view.EmployeeView;
import dakplusplus.view.WorkDoneView;

public class Main {

	public static void main(String[] args) {
		
		
		
		int mainChoice;
		int subChoice = -1;

		do {
			showMenu();
			mainChoice = requestIntInput(0, 3);

			if (mainChoice != 0) {
				showSubMenu(mainChoice);
				subChoice = requestIntInput(0, 4);

				handleUserChoice(mainChoice, subChoice);
			}
		} while (mainChoice != 0 && subChoice != 0);
		
		
	}

	private static void showMenu() {
		System.out.println("0. Exit");
		System.out.println("1. Employees");
		System.out.println("2. Projects");
		System.out.println("3. WorkDones");
	}

	private static void showSubMenu(int choice) {
		if (choice == 1) {
			System.out.println("0. Exit");
			System.out.println("1. Show all employees");
			System.out.println("2. Add a new Employee");
			System.out.println("3. Edit an employee");
			System.out.println("4. Delete an employee (by id)");
		}

		if (choice == 2) {
			System.out.println("This shit doesn't work yet...");
		}
	}

	private static void handleUserChoice(int mainChoice, int subChoice) {
		if (mainChoice == 1) {
			if (subChoice == 1) {
				// show all employees
				EmployeeView.showAllEmployees();

			}

			if (subChoice == 2) {
				// Add a new employee
				EmployeeView.addEmployee();

			}

			if (subChoice == 3) {
				// Edit an employee
				EmployeeView.EditEmployee();

			}
			if (subChoice == 4) {
				// Delete an employee
				EmployeeView.deleteEmployee();

			}
		}
		
		if(mainChoice==2) {
			
		}
		
		if(mainChoice==3) {
			
		}
	}

	private static int requestIntInput(int lower, int upper) {
		Scanner scanner = new Scanner(System.in);
		int input = -1;
		do {
			try {
				System.out.print("Make a choice: ");
				input = scanner.nextInt();
			} catch (InputMismatchException e) {
				input = -1;
			}
			scanner.nextLine();
			if (input < lower || input > upper)
				System.out.println("That's not a valid number");
		} while (input < lower || input > upper);

		return input;
	}
}

package CompanyOrganizer;

import static java.lang.System.in;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class CompanyRunner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String file = "src/CompanyOrganizer/company.txt";
		Company comp = new Company(file);
		
		//System.out.println(((Manager)comp.getEmployee(2)).isOverBudget(200));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\n\t\t\t\t\tWELCOME TO COMPANY ORGANIZER\n\t\t\t\t\t\tAuthor: Zoe Chan");
		System.out.println("\nIn this program, you will be able to manage the finances and different functions of the company depending on your role.");
		System.out.println("There are five different roles in the company: CEO, Accountant, Manager, Salary Worker, and Hourly Worker. \nSelect a role and try out the approtriate tasks.");
		System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
		Scanner keyboard = new Scanner(in);
		
		System.out.println("You are working in " + comp.getName());
		
		whichEmployee(keyboard, comp);
		
		
	}
	
	public static void whichEmployee(Scanner keyboard, Company c) {
		System.out.println("Which employee are you? (1 = CEO, 2 = Accountant, 3 = Manager, 4 = Salary Worker, 5 = Hourly Worker 6 = Stop)");
		int role = keyboard.nextInt();
		
		if (role == 1) {
			runCEO(keyboard, c);
		}
		else if (role == 2) {
			runAccountant(keyboard, c);
		}
		else if (role == 3) {
			runManager(keyboard, c);
		}
		else if (role == 4) {
			runSWorker(keyboard, c);
		}
		else if (role == 5) {
			runHWorker(keyboard, c);
		}
		else {
			runEnd(c);
		}
	}
	
	public static void runCEO(Scanner keyboard, Company c) {
		System.out.println("\nCEO\n");
		System.out.println("1 = Add employees \n2 = Remove employees \n3 = Spend money \n 4 = Change salary of employee \n5 = Report benefits \n6 = Report company budget \n7 = Return to employees");
		System.out.println("Select one");
		int choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("Select an employee type: (1 = CEO, 2 = Accountant, 3 = Manager, 4 = Salary Worker, 5 = Hourly Worker)");
			int tempChoice = keyboard.nextInt();
			System.out.println("How many employees would you like to add? ");
			int addNum = keyboard.nextInt();
			
			((CEO)c.getEmployee(0)).addEmployee(tempChoice-1, addNum, c);
			runCEO(keyboard, c);
			
		}
		else if (choice == 2) {
			System.out.println("Select an employee type: (1 = CEO, 2 = Accountant, 3 = Manager, 4 = Salary Worker, 5 = Hourly Worker)");
			int tempChoice = keyboard.nextInt();
			System.out.println("How many employees would you like to remove? ");
			int addNum = keyboard.nextInt();
			
			((CEO)c.getEmployee(0)).removeEmployee(tempChoice-1, addNum, c);
			runCEO(keyboard, c);
			
		}
		else if (choice == 3) {
			System.out.println("How much money would you like to spend? ");
			int spendMoney = keyboard.nextInt();
			
			((CEO)c.getEmployee(0)).spendMoney(spendMoney, c);
			runCEO(keyboard, c);
		}
		else if (choice ==4) {
			System.out.println("Select an employee type: (1 = CEO, 2 = Accountant, 3 = Manager, 4 = Salary Worker, 5 = Hourly Worker)");
			int tempChoice = keyboard.nextInt();
			System.out.println("What would you like to set the salary to? ");
			int newSal = keyboard.nextInt();
			
			((CEO)c.getEmployee(0)).changeSalary(tempChoice-1, newSal, c);
			runCEO(keyboard, c);
		}
		else if (choice == 5) {
			System.out.println("Your benefits are: " + ((CEO)c.getEmployee(0)).getBenefits());
			runCEO(keyboard, c);
		}
		else if (choice == 6) {
			System.out.println("The company budget is $" + ((CEO)c.getEmployee(0)).getBudget(c));
			runCEO(keyboard, c);
		}
		else {
			whichEmployee(keyboard,c);
		}
		
	}
	
	public static void runAccountant(Scanner keyboard, Company c) {
		System.out.println("\nAccountant\n");
		System.out.println("1 = Report company expenses \n2 = Report employee salaries \n3 = Report benefits\n 4 = Return to employees");
		System.out.println("Select one");
		int choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println(("The company expenses is $" + ((Accountant)c.getEmployee(1)).getExpenses(c)));
			runAccountant(keyboard, c);
		}
		else if (choice == 2) {
			System.out.println("Select an employee type: (1 = CEO, 2 = Accountant, 3 = Manager, 4 = Salary Worker, 5 = Hourly Worker)");
			int tempChoice = keyboard.nextInt();
			
			System.out.println("This employee has a salary of $" + ((Accountant)c.getEmployee(1)).getSalary(tempChoice - 1, c));
			runAccountant(keyboard, c);
		}
		else if (choice == 3) {
			System.out.println("Your benefits are: " + ((Accountant)c.getEmployee(1)).getBenefits());
			runAccountant(keyboard, c);
		}
		else {
			whichEmployee(keyboard,c);
		}
	}
	
	public static void runManager(Scanner keyboard, Company c) {
		System.out.println("\nManager\n");
		System.out.println("1 = Report team budget \n2 = Report if spending is over budget \n3 = Report benefits\n 4 = Return to employees");
		System.out.println("Select one");
		int choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println(("The team budget is $" + ((Manager)c.getEmployee(2)).getBudget()));
			runManager(keyboard, c);
		}
		else if (choice == 2) {
			System.out.println("How much are you spending? ");
			int spending = keyboard.nextInt();
			
			boolean overBudget = ((Manager)c.getEmployee(2)).isOverBudget(spending);
			
			if (overBudget == true) {
				System.out.println("You are overbudget");
			}
			else {
				System.out.println("You are underbudget");
			}
			runManager(keyboard, c);
			
		}
		else if (choice == 3) {
			System.out.println("Your benefits are: " + ((Manager)c.getEmployee(2)).getBenefits());
			runManager(keyboard, c);
		}
		else {
			whichEmployee(keyboard,c);
		}
	}
	
	public static void runSWorker(Scanner keyboard, Company c) {
		System.out.println("\nSalary Worker\n");
		System.out.println("1 = Report weekly salary \n2 = Report benefits\n 3 = Return to employees");
		System.out.println("Select one");
		int choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println(("Your weekly salary is $" + ((SalaryWorker)c.getEmployee(3)).getSalary()));
			runSWorker(keyboard, c);
		}
		else if (choice == 2) {
			System.out.println("Your benefits are: " + ((SalaryWorker)c.getEmployee(3)).getBenefits());
			runSWorker(keyboard, c);
		}
		else {
			whichEmployee(keyboard,c);
		}
	}
	
	public static void runHWorker(Scanner keyboard, Company c) {
		System.out.println("\nHourly Worker\n");
		System.out.println("1 = Report weekly salary \n2 = Return to employees");
		System.out.println("Select one");
		int choice = keyboard.nextInt();
		
		if (choice == 1) {
			System.out.println("How many hours did you work this week? ");
			int hours = keyboard.nextInt();
			System.out.println(("Your weekly wage is $" + ((HourlyWorker)c.getEmployee(4)).getWage(hours)));
			runHWorker(keyboard, c);
		}
		else {
			whichEmployee(keyboard,c);
		}
	}
	
	public static void runEnd(Company c) throws IOException {
		System.out.println("\nThank you for using Company Organizer. Your report will be produced shortly.");
		File report = new File("src/CompanyOrganizer/companyReport.txt");
		try{
			FileWriter writer = new FileWriter("companyReport.txt");
			writer.write(c.getName());
			writer.write(c.getEmployee(0) + ", " + c.getEmployee(1) + ", " + c.getEmployee(2) + ", " + c.getEmployee(3) + ", " + c.getEmployee(4) + ", ");
			writer.write(c.getBudget());
			writer.write(c.getExpenses());
			writer.write("CEO\n" + c.getEmployee(0).getNum() + "\n" + c.getEmployee(0).getSalary() + "\n" + c.getEmployee(0).getBenefits());
			writer.write("Accountant\n" + c.getEmployee(1).getNum() + "\n" + c.getEmployee(1).getSalary() + "\n" + c.getEmployee(1).getBenefits());
			writer.write("Manager\n" + c.getEmployee(2).getNum() + "\n" + c.getEmployee(2).getSalary() + "\n" + c.getEmployee(2).getBenefits() + ((Manager)c.getEmployee(2)).getBudget());
			writer.write("Salary Worker\n" + c.getEmployee(3).getNum() + "\n" + c.getEmployee(3).getSalary() + "\n" + c.getEmployee(3).getBenefits());
			writer.write("Hourly Worker\n" + c.getEmployee(1).getNum() + "\n" + c.getEmployee(1).getSalary());
			writer.close();
		} catch (IOException e) {
			System.out.println("file was not made successfully");
		}

		//code to create and write files sourced from https://www.w3schools.com/java/java_files_create.asp
		
		
		
	}
	
	
	
}

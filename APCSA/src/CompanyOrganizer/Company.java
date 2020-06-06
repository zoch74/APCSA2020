package CompanyOrganizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import FinalProject.Author;

public class Company {

	private String name;
	private int budget;
	private int expenses;
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Company() throws FileNotFoundException {
		setUpCompany("");
	}
	
	public Company(String fl) throws FileNotFoundException {
		setUpCompany(fl);
	}
	
	
	private void setUpCompany(String fl) throws FileNotFoundException {
		
		Scanner file = new Scanner(new File(fl));
		name = file.nextLine();
		//System.out.println("name: " + name);
		//String[] emp = file.nextLine().split(",");
		String emp = file.nextLine();
		//System.out.println("employees: " + emp);
		budget = file.nextInt();
		//System.out.println("budget: " + budget);
		file.nextLine();
		expenses = file.nextInt();
		//System.out.println("expenses: " + expenses);
		file.nextLine();
		for (int i = 0; i < 5; i++ ) {
			String tempName = file.nextLine();
			int tempNum = file.nextInt();
			file.nextLine();
			int tempSalary = file.nextInt();
			file.nextLine();
			String tempBenefits = file.nextLine();
			if (tempName.equals("CEO") ) {
				employees.add(new CEO(tempNum,tempSalary,tempBenefits));
				//System.out.println(employees);
			}
			else if (tempName.equals("Accountant") ) {
				employees.add(new Accountant(tempNum,tempSalary,tempBenefits));
				//System.out.println(employees);
			}
			else if (tempName.equals("Manager") ) {
				int tempBudget = file.nextInt();
				file.nextLine();
				employees.add(new Manager(tempNum,tempSalary,tempBenefits, tempBudget));
				//System.out.println(employees);
			}
			else if (tempName.equals("SalaryWorker") ) {
				employees.add(new SalaryWorker(tempNum,tempSalary,tempBenefits));
				//System.out.println(employees);
			}
			else {
				employees.add(new HourlyWorker(tempNum,tempSalary));
				//System.out.println(employees);
			}
			
		}
		
		
	}
	
	public void setName(String n) {
		name = n;
	}
	private void setBudget(int b) {
		budget = b;
	}
	public void setExpenses(int e) {
		expenses = e;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public String getName() {
		return name;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public int getExpenses() {
		return expenses;
	}
	
	public Employee getEmployee(int ind) {
		return employees.get(ind);
	}
	
	public String toString() {
		return name + ": " + "budget of $" + budget + ": expenses of $" + expenses;
	}
	
}

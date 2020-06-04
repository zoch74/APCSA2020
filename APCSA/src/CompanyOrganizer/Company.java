package CompanyOrganizer;

import java.util.ArrayList;

public class Company {

	private String name;
	private int budget;
	private int expenses;
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Company() {
		name = "";
		budget = 1;
		expenses = 1;
		employees = new ArrayList<Employee>();
	}
	
	public Company(String n, int b, int e) {
		name = n;
		budget = b;
		expenses = e;
	}
	
	private void setName(String n) {
		name = n;
	}
	private void setBudget(int b) {
		budget = b;
	}
	private void setExpenses(int e) {
		expenses = e;
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
	
	public String toString() {
		return name + ": " + "budget of $" + budget + ": expenses of $" + expenses;
	}
	
}

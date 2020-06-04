package CompanyOrganizer;

import java.util.ArrayList;

public class Employee {
	private int number;
	private int salary;
	private ArrayList<String> benefits;
	
	public Employee(){
		number = 0;
		salary = 15;
		benefits = new ArrayList<String>();
	}
	
	public Employee(int num, int sal, String bene) {
		number = num;
		salary = sal;
		setBenefits(bene);
	}
	
	private void setNumber(int n) {
		number = n;
	}
	
	private void setSalary(int s) {
		salary = s;
	}
	
	private void setBenefits(String b) {
		//need to add code
	}
	
	public int getNum() {
		return number;
	}
	
	public int getSalary() {
		return salary;
	}
	public String getBenefits() {
		return benefits.toString();
	}
	
	public String toString() {
		return "Employee: " + getNum() + " : " + getSalary() + " : " + getBenefits();
	}
	
}

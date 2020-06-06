package CompanyOrganizer;

import java.util.ArrayList;

public class Employee {
	private int number;
	private int salary;
	//private ArrayList<String> benefits;
	private String benefits;
	
	public Employee(){
		number = 0;
		salary = 15;
		//benefits = new ArrayList<String>();
	}
	public Employee(int num, int sal) {
		number = num;
		salary = sal;
		//benefits = new ArrayList<String>();
	}
	
	public Employee(int num, int sal, String bene) {
		number = num;
		salary = sal;
		setBenefits(bene);
	}
	
	public void setNumber(int n) {
		number = n;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	
	private void setBenefits(String b) {
		/*String[] bene = b.split(",");
		for (String i : bene) {
			benefits.add(i);
		}*/
		
		benefits = b;
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

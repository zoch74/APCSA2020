package CompanyOrganizer;

public class Accountant extends Employee {

	public Accountant() {
		super();
	}
	
	public Accountant(int num, int sal, String bene) {
		super(num, sal, bene);
	}
	
	public int getExpenses(Company c) {
		return c.getExpenses();
	}
	
	public int getSalary(int n,Company c) {
		if (n == 1) {
			return c.getEmployee(0).getSalary();
		}
		else if (n == 2) {
			return c.getEmployee(1).getSalary();
		}
		else if (n == 3) {
			return c.getEmployee(2).getSalary();
		}
		else if (n == 4) {
			return c.getEmployee(3).getSalary();
		}
		else {
			return c.getEmployee(4).getSalary();
		}
	}
	
}

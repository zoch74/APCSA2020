package CompanyOrganizer;

public class Manager extends Employee {

	private int budget;
	
	public Manager() {
		super();
		budget = 0;
	}
	
	public Manager(int num, int sal, String bene, int e) {
		super( num,  sal,  bene);
		budget = e;
	}
	
	public int getBudget() {
		return budget;
	}
	
	//returns true if the input amount is greater than the budget
	public boolean isOverBudget(int num) {
		
		if (num > budget) {
			return true;
		}
		return false;
		
	}
	
	public String toString() {
		return "Employee: " + getNum() + " : " + getSalary() + " : " + getBenefits() + " : " + getBudget();
	}
	
}

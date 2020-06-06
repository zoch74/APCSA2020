package CompanyOrganizer;

public class CEO extends Employee {

	public CEO() {
		super();
	}
	
	public CEO(int num, int sal, String bene) {
		super(num,sal,bene);
	}
	
	public void addEmployee(int ind, int num, Company c) {
		int newNum = c.getEmployee(ind).getNum() + num;
		c.getEmployee(ind).setNumber(newNum);
	}
	public void removeEmployee(int ind, int num, Company c) {
		int newNum = c.getEmployee(ind).getNum() - num;
		c.getEmployee(ind).setNumber(newNum);
	}
	
	public void spendMoney(int money, Company c) {
		int newExpense = c.getExpenses() + money;
		c.setExpenses(newExpense);
	}
	
	public int getBudget(Company c) {
		return c.getBudget();
	}
	
	public void changeSalary(int ind, int newSal, Company c) {
		
		c.getEmployee(ind).setSalary(newSal);
	}
	
}

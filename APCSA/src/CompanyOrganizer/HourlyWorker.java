package CompanyOrganizer;

public class HourlyWorker extends Employee {

	public HourlyWorker() {
		super();
	}
	
	public HourlyWorker(int num, int sal) {
		super(num,sal);
	}
	
	public int getWage(int hours) {
		return super.getSalary() * hours;
	}
	
	public String toString() {
		return "Employee: " + getNum() + " : " + getSalary();
	}
	
}

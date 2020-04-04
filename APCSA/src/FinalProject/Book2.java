package FinalProject;

public class Book2 {

	private String name;
	private double price;
	private boolean series;
	
	public Book2() {
		setName("");
		setPrice(0);
		setSeries(false);
	}
	
	public Book2(String name, double price, boolean series) {
		setName(name);
		setPrice(price);
		setSeries(series);
	}
	
	
	private void setName(String nm) {
		name = nm;
	}
	private void setPrice(double pr) {
		price = pr;
	}
	private void setSeries(boolean srs) {
		series = srs;
	}
	
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public boolean getSeries() {
		return series;
	}
	
	
	public String toString() {
		
		String isSeries;
		if (getSeries()) {
			isSeries = "Yes";
		}
		else {
			isSeries = "No";
		}
		
		return name + " - " + price + " - Is in a series: " + isSeries;
	}
	
	

}

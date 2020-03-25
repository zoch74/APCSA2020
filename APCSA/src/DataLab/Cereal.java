package DataLab;
/*
 Represents information about a NWS weather station
*/

public class Cereal {

	private String name;
	private char type;
	private int calories, protein, fat, sodium, fiber, carbs, sugar, potassium, vitamins, shelf;
	private double weight, cups, rating;
	
   
   Cereal(String nm, char tp, int cal, int ptn, int f, int sod, int fib, int carb, int sug, int ptsm, int vtm, int shf, double wght, double cps, double rtng) {
      
	   this.name = nm;
	   this.type = tp;
	   this.calories = cal;
	   this.protein = ptn;
	   this.fat = f;
	   this.sodium = sod;
	   this.fiber = fib;
	   this.carbs = carb;
	   this.sugar = sug;
	   this.potassium = ptsm;
	   this.vitamins = vtm;
	   this.shelf = shf;
	   this.weight = wght;
	   this.cups = cps;
	   this.rating = rtng;
	   
   }
   
   
   public int getCarb() { 
      return carbs;
   }
   
   public String getName() { 
      return name;
   }
   public int getProtein() { 
	      return protein;
	   }
   
   
   public String toString() {
	   return getName() + ": " + getCarb() + "g carbs + " + getProtein() + "g protein";
   }
   
   public static void main(String[] args) {
	   Cereal brand1 = new Cereal("100% Bran", 'C', 70, 4, 1, 130, 10, 5, 6, 280, 25, 3, 1, 0.33, 68.402);
	   Cereal brand2 = new Cereal("Cinnamon Toast Crunch", 'C', 120, 1, 3, 210, 0, 13, 9, 45, 25, 2, 1, 0.75, 19.824);
	   Cereal brand3 = new Cereal("Cream of Wheat(Quick)", 'H', 100, 3, 0, 80, 1, 21, 0, -1, 0, 2, 1, 1, 64.534);
	   
	   Cereal[] brands = {brand2, brand1, brand3};
	   
	   Cereal bestBrand = brands[0];
	   
	   for (int i = 1; i < brands.length; i++) {
		   if (brands[i].getCarb() <= bestBrand.getCarb() && brands[i].getProtein() >= bestBrand.getProtein()) {
			   bestBrand = brands[i];
		   }
	   }
	   
	   System.out.println("The best low carb, high protein cereal is: " + bestBrand);
	   
   }
   
}
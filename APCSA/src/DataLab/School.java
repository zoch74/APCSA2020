package DataLab;
/*
 Represents information about a NWS weather station
*/

public class School {
	private String dbn;
   private String name;
   private int num;
   private int readMean;
   private int mathMean;
   private int writeMean;
   
   School(String dbn, String nm, int n, int rMean, int mMean, int wMean) {
      this.dbn = dbn;
      this.name = nm;
      this.num = n;
      this.readMean = rMean;
      this.mathMean = mMean;   
      this.writeMean = wMean;
   }
   
   /* Produce the id of this station */
   public String getDBN() { 
      return dbn;
   }
   
   /* Produce the name of this station */
   public String getName() { 
      return name;
   }
   public int getRead() { 
	      return readMean;
	   }
   public int getWrite() { 
	      return writeMean;
	   }
   
   /* Determine if this weather station is located in the given state */
   public int rwDif() {
      return Math.abs(this.getRead() - this.getWrite());
   }
   
}
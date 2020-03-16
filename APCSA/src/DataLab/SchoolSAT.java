package DataLab;
/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;


public class SchoolSAT {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/zt9s-n5aj/rows.xml").load();
      ArrayList<School> allschl = ds.fetchList(School.class, "row/row/dbn", 
             "row/row/school_name", "row/row/number_of_test_takers",
             "row/row/critical_reading_mean", "row/row/mathematics_mean", "row/row/writing_mean");
      System.out.println("Total schools: " + allschl.size());
      
      int rwDif = 0;
      School bigDif = new School(null, null, 0, 0, 0, 0);
      for (School schl : allschl) {
          if (schl.rwDif() > rwDif) {
        	  rwDif = schl.rwDif();
        	  System.out.println(rwDif);
        	  bigDif = schl;
          }
       }
      System.out.println("  The school with the greatest difference in mean writing and reading scores: " + bigDif.getDBN() + ": " + bigDif.getName());
   }
}
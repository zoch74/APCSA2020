package ConsumerLab;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

//*****fix file names to have the right pathway!!!*****

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("src/ConsumerLab/cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/ConsumerLab/negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

/** Activity 2: totalSentiment()
  * Write the code to total up the sentimentVals of each word in a review.
 */
  public static double totalSentiment(String filename)
  {
    // read in the file contents into a string using the textToString method with the filename
	  String file = textToString(filename);

    // set up a sentimentTotal variable
	  double sentimentTotal = 0;

    // loop through the file contents 
	  
	  int loc = file.indexOf(" ");
	  //String test = "";
	  //int num = 0;
	  String file_saved = "";
	  String word = "";
	  
	  do {
		  
		  if (loc == -1) {
			  word = file;
		  }
		  else {
			  word = file.substring(0, loc);
		  }
		  if (getPunctuation(word) != "") {
			  word = word.substring(0,word.length()-1);
		  }
	
		  sentimentTotal = sentimentTotal + sentimentVal(word);
		  //test = test + word + ":" + sentimentVal(word) + " ";
		  file_saved = file;
		  file = file.substring(loc+1);
		  loc = file.indexOf(" ");
		  //num++;
	  } while (!(file_saved.equals(file)));
	  
       // find each word
       // add in its sentimentVal
       // set the file contents to start after this word
   
	  //System.out.println(test);
	 // System.out.println("Number of words found = " + num);
	  return sentimentTotal; 
	  
  }


  /** Activity 2 starRating method
     Write the starRating method here which returns the number of stars for the review based on its totalSentiment.
  */
  public static int starRating(String filename)
  {
    // call the totalSentiment method with the fileName
	  double totalSentiment = totalSentiment(filename);
    // determine number of stars between 0 and 4 based on totalSentiment value 
    int stars;
    // write if statements here
    if (totalSentiment > 25) {
    	stars = 4;
    }
    else if (totalSentiment > 15) {
    	stars = 3;
    }
    else if (totalSentiment > 5){
    	stars = 2;
    }
    else {
    	stars = 1;
    }
  
    // return number of stars
    return stars; 
  }
  
  // if the type input = 1, then the review is positive. if the type is -1, then the review is negative.
  public static String fakeReview(String filename, int type) {
	  String review = textToString(filename);
	  String finalReview = "";
	  
	  int locStar = review.indexOf("*");
	  int locSpace = 0;
	  String start = "";
	  String middle = "";
	  String end = "";
	  
	  do {
		  
		  	start = review.substring(0, locStar);
			middle = review.substring(locStar + 1);
			locSpace = middle.indexOf(" ");
			end = middle.substring(locSpace +1);
			if (type ==1) {
				finalReview = start + randomPositiveAdj() + " " + end;
			}
			else if (type == -1) {
				finalReview = start + randomNegativeAdj() + " " + end;
			}
		  
			review = finalReview;
			locStar = review.indexOf("*");

	  } while (locStar != -1);
	  
	  
	  return review;
  }
}
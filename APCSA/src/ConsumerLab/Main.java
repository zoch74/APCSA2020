package ConsumerLab;

import java.util.Scanner;
import java.io.File;


class Main {
  public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
		
		double val = Review.sentimentVal("exciting");
		System.out.println("Review = " + val);
		
		double review = Review.totalSentiment("src/ConsumerLab/simpleReview.txt");
		//System.out.println("Total review = " + review);
		System.out.printf("Total review : %.2f\n", review);
		
		double review1 = Review.totalSentiment("src/ConsumerLab/26WestReview.txt");
		//System.out.println("Total review = " + System.out.printf("%.2f\n", review1));
		System.out.printf("Total review : %.2f\n", review1);
		
		int star = Review.starRating("src/ConsumerLab/simpleReview.txt");
		System.out.println("star rating = " + star);
		
		int star1 = Review.starRating("src/ConsumerLab/26WestReview.txt");
		System.out.println("star rating = " + star1);
		
		String fakeReview = Review.fakeReview("src/ConsumerLab/fakeReview.txt", -1);
		System.out.println(fakeReview);
		
		String fakeReview1 = Review.fakeReview("src/ConsumerLab/fakeReview.txt", 1);
		System.out.println(fakeReview1);
		
		
  }
}
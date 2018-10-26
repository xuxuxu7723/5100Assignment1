package assignment6;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
	// instance variables
	  private String title;   // title of the movie
	  private ArrayList<Integer> ratings; // list of ratings stored in a Store object

	  //constructor
	  public Mreview() {
	  }
	  
	  public Mreview(String title) {
		  this.title = title;
	  }
	  
	  public Mreview(String title, int firstRating) {
		  this.title = title;
		  this.ratings = new ArrayList<Integer>();
		  this.ratings.add(firstRating);
	  }
	  
	  //method
	  public static void main(String[] args) {
		  Mreview mr = new Mreview("Kill Bill",3);
		  mr.addRating(4);
		  mr.addRating(3);
		  System.out.println(mr);
		  System.out.println(mr.aveRating());
		  
		  Mreview mr1 = new Mreview("Kill Bill",3);
		  mr1.addRating(4);
		  mr1.addRating(3);
		  System.out.println(mr1.compareTo(mr));
		  System.out.println(mr1.equals(mr));
		  
		  Mreview mr2 = new Mreview("Kill",3);
		  mr2.addRating(4);
		  mr2.addRating(3);
		  System.out.println(mr2.compareTo(mr));
		  System.out.println(mr2.equals(mr));
	  }
	  public String getTitle() {
		  return title;
	  }
	  
	  public void addRating(int r) {
		  ratings.add(r);
	  }
	  
	  public double aveRating() {
		  int sum = 0;
		  //int count = 0;
		  for (int r : ratings) {
			  sum += r;
			  //count ++;
		  }
		  return sum/ratings.size();
	  }
	 
	  public int numRatings() {
		  return ratings.size();
	  }
	  
	  @Override
	  public int compareTo(Mreview obj) {
		  return this.title.compareTo(obj.getTitle());
		 
	  }
	
	  public boolean equals(Mreview obj) {
		 if (this.title == obj.title) {
			 return true;
		 } else {
			 return false;
		 }
	  }
	  
	  public String toString() {
		  return title + ", average " + aveRating() + " out of " + numRatings() + " ratings";
	  }
}

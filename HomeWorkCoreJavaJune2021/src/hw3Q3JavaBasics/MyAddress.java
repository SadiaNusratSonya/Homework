package hw3Q3JavaBasics;

public class MyAddress {

	
	  public static String MyName = "Sadia Nusrat Sonya"; //Variable initialized
	  public static int myAge = 29;
	  public static char mySex = 'F' ;
	  public static boolean usCitizenship = false;
	  public static byte yearsOfExperience = 5;
	  public static short myRent = 3500;
	  public static long myYearlySalary = 120000l;
	  public static float myGrade = 3.96f;
	  public static double myHeight = 5.318765;
	  
	  
	   
	   public static void myAddress() {
		   
		   System.out.println("My name is: " + MyName +",\nAge: "+ myAge +"\nMy sex is:  " + mySex +
				   "\nCitizenship Status: " + usCitizenship + "\nYears of experience: " + yearsOfExperience
				   + "\nMy rent: " + myRent + "\nYearly salary: " + myYearlySalary + "\nMy Grade: "
				   + myGrade + "\nMy height: " + myHeight);
				  
	   }
	   
			
	
	public static void main(String[] args) {
		
		myAddress();
		

	}

}

package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {
	
		
		  public String MyName;
		  public int myAge;
		  public char mySex;
		  public boolean usCitizenship;
		  public byte yearsOfExperience;
		  public short myRent;
		  public long myYearlySalary;
		  public float myGrade;
		  public double myHeight;
		  
		  
		  public MyProfile() {//Constructor declared
			  
		  }
		  
		   
		   public void myProfile() {//Method implemented
			   System.out.println("My name is: " + MyName +",\nAge: "+ myAge +"\nMy sex is:  " + mySex +
					   "\nCitizenship Status: " + usCitizenship + "\nYears of experience: " + yearsOfExperience
					   + "\nMy rent: " + myRent + "\nYearly salary: " + myYearlySalary + "\nMy Grade: "
					   + myGrade + "\nMy height: " + myHeight);
					  
		   }
		   
				
		public static void main(String[]args) {
			MyProfile sadia = new MyProfile() ;
			sadia.MyName = "Sadia";
			sadia.myAge = 29;
			sadia.mySex = 'F';
			sadia.usCitizenship = false;
			sadia.yearsOfExperience = 5;
			sadia.myRent = 3500;
			sadia.myYearlySalary = 120000l;
			sadia.myGrade = 3.96f;
			sadia.myHeight = 5.318765;
			System.err.println("***********************************");
			
			
			MyProfile nivan = new MyProfile() ;
			nivan.MyName = "Nivan";
			nivan.myAge = 25;
			nivan.mySex = 'M';
			nivan.usCitizenship = true;
			nivan.yearsOfExperience = 3;
			nivan.myRent = 3500;
			nivan.myYearlySalary = 120000l;
			nivan.myGrade = 3.96f;
			nivan.myHeight = 5.318765;
			
			
			
			
					
		}
		}
			
		
			
		
		



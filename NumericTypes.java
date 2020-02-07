import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double temperature;
		Scanner input = new Scanner(System.in);
		
		//Task #2 declare a variable to hold the user’s temperature
		
		System.out.print("Enter score 1: ");
		//Task #2 prompt user to input score1
		score1 = input.nextInt();
		
		//Task #2 read score1
		System.out.print("Enter score 2: ");
		//Task #2 prompt user to input score2
		score2 = input.nextInt();
		
		//Task #2 read score2 
		
		// Find an arithmetic average
		average = (double)(score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		fToC =  (BOILING_IN_F - 32) * 5/9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.print("Enter temperature in Fahrenheit: ");
		
		//Task #2 prompt user to input another temperature
		temperature = input.nextDouble();
		//Task #2 read the user’s temperature in Fahrenheit
		
		//Task #2 convert the user’s temperature to Celsius
		fToC = (temperature - 32)*5/9;
		
		//Task #2 print the user’s temperature in Celsius
		System.out.println(temperature + " in Fahrenheit is " + fToC + " in Celcius");
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}





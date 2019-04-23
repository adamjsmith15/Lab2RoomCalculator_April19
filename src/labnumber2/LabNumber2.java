package labnumber2;

import java.util.Scanner;

public class LabNumber2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// initialize character for while loop to keep playing
		char keepPlaying = 'y';
		// will continue loop while keepPlaying does not equal n
		do {
			//Initialize variables
			double lengthRect;
			double widthRect;
			double heightRect;
			
			// prints welcome screen
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			
			System.out.println("Enter length: ");
			// get character input for length
			lengthRect = scnr.nextDouble();
			
			System.out.println("Enter width: ");
			// get character input for width
			widthRect = scnr.nextDouble();
			
			System.out.println("Enter height: ");
			// get character input for height
			heightRect = scnr.nextDouble();
			
			// initialize and calculate area
			double area = lengthRect * widthRect;
			
			// initialize and calculate perimeter
			double perimeter = lengthRect * 2 + widthRect * 2;
			
			// initialize and calculate volume
			double volume = lengthRect * widthRect * heightRect;
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			System.out.println("Continue? (y/n)");
			
			//creates a string from user input
			String tempKeepPlaying = scnr.next();
			
			// converts user input to lower case
			tempKeepPlaying.toLowerCase();
			
			// takes first character of string and assigns it to keepPlaying
			keepPlaying = tempKeepPlaying.charAt(0);

		}while (keepPlaying != 'n');
		//closes scanner outside of while loop
		scnr.close();

	}

}

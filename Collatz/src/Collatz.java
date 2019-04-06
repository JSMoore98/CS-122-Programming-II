import java.util.Scanner;

/**
 * This program takes in a number and outputs the collatz sequence
 * that starts at that inputed number
 * @author Josiah
 *
 */

public class Collatz {

	public static void main(String[] args) {
		//Declares the variables and scanner
		int num=2;
		boolean invalid = true;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a "
				+ "whole number great than 1.");
		
		//Checks validity of the input
		do {
			//Handles the case where input isn't an integer
			try{
				num = keyboard.nextInt();
				invalid = false;
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Error, please enter "
						+ "a whole number greater than 1");
				keyboard.next();
			}
			
			//Handles the case if the input is less than 2
			if(num < 2) {
				invalid = true;
				System.out.println("Error, please enter "
						+ "a whole number greater than 1");
			}
			
			
		} while(invalid);
		
		//Outputs the starting number and calls the recursive method
		System.out.println(num);
		collat(num);		

		//Closes the keyboard
		keyboard.close();
	}
	
	/**
	 * The recursive method that gets the collatz sequence
	 * @param num The starting number
	 */
	public static void collat(int num) {
		//Modifies the number based on whether or not it's even
		if (num % 2 == 0)
			num = num / 2;
		else
			num = (num*3) + 1;
		
		//Outputs the next number in the sequence
		System.out.println(num);
		
		//Calls itself if the base case hasn't been reached
		if (num != 1)
			collat(num);
	}

}

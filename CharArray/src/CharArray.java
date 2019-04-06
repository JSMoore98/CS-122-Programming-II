import java.io.*;
import java.util.Scanner;

/**
 * This program reads in a text file that contains ASCII values
 * and sums up any digits within that file, ignoring any
 * ASCII values that aren't digits
 * @author jmoore44
 *
 */
public class CharArray {

	public static void main(String[] args) throws IOException 
	{
		
		//Declares the keyboard and gets the file name
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the name of your file:");
		String fileName = keyboard.nextLine();
		
		//Creates a scanner for the file
		File chars = new File(fileName);
		Scanner inputFile = new Scanner(chars);

		//Calls the methods to retrieve the sum and outputs it
		int sum = (getChars(inputFile));
		System.out.println("The sum total is: " + sum);
		
		//Closes the input file and keyboard
		inputFile.close();
		keyboard.close();
	}
	
	/**
	 * This method reads the file and stores each character
	 * into a character array, then passes the array and length
	 * variable for the array the getSum method to calculate the sum
	 * @param inputFile The file reader
	 * @return Returns the summed total
	 */
	public static int getChars(Scanner inputFile)
	{
		//Declares variables and array
		int i=0;
		int totalNums=0; //The total characters filled in the array
		char[] charArray = new char[100];
		
		//Loops through and adds to the array each character in the file
		while(inputFile.hasNext())
		{
			int characterInt = inputFile.nextInt();
			char character = (char)characterInt;
			charArray[i] = character;
			
			//Iterates the control & array length variables
			i++;
			totalNums++;
		}
		
		//Calls the method to calculate the sum
		int sum = getSum(charArray, totalNums);

		return sum;
	}
	
	/**
	 * This method reads through each element of the character 
	 * array, then checks if that element is a digit.
	 * If so, it adds it to the sum, otherwise it's ignored
	 * @param array The character array
	 * @param length The length of the array
	 * @return Returns the final sum
	 */
	public static int getSum(char[] array, int length)
	{
		int sum = 0;
		
		//Loops through the array
		for (int x=0;x<length;x++)
		{
			//Checks if the array element is a digit and sums it
			int character = array[x];
			switch (character)
				{
				//Checks character against each possible ASCII digit
					case 48:
						sum = sum + 0;
					break;
					case 49:
						sum = sum + 1;
					break;
					case 50:
						sum = sum + 2;
					break;
					case 51:
						sum = sum + 3;
					break;
					case 52:
						sum = sum + 4;
					break;
					case 53:
						sum = sum + 5;
					break;
					case 54:
						sum = sum + 6;
					break;
					case 55:
						sum = sum + 7;
					break;
					case 56:
						sum = sum + 8;
					break;
					case 57:
						sum = sum + 9;
					break;
				}
		}
		return sum;
	}
}

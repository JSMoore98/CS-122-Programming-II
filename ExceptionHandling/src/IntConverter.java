import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program reads in a text file containing a list of integers,
 * then takes a user given value, adds that number to each of the
 * integers, and then writes it to a binary file.
 * @author Josiah Moore
 *
 */
public class IntConverter {

/**
 * Declares the scanners and binary output file,
 * then calls the methods that execute the program
 * @throws FileNotFoundException Stops complaints from the program
 * about not being able to create the output file despite the text
 * being hard coded in
 */
	public static void main(String[] args) throws FileNotFoundException
	{
		//Delcares scanners and Output File
		Scanner keyboard = new Scanner(System.in);
		Scanner nums = new Scanner(System.in);
		DataOutputStream outputFile = new DataOutputStream
				(new FileOutputStream("output.txt"));
		
		//Calls the program methods
		outputFile = new DataOutputStream
					(new FileOutputStream("output.txt"));
		nums = getFile(keyboard,nums);
		int value = getInt(keyboard);
		write(keyboard, nums, outputFile, value);

		
		System.out.println("Program has finished running");
		
		//Close the scanners and output files
		keyboard.close();
		nums.close();
		try {
			outputFile.close();
		} catch (IOException e) {}
	}

/**
 * This method gets the text file name from the user
 * and makes sure it's valid
 * @param keyboard The keyboard scanner
 * @param nums The integer scanner
 * @return Returns the integer Scanner
 */
	private static Scanner getFile(Scanner keyboard, 
								Scanner nums)
	{
		boolean invalid = true;
		
		//Gets the text file name as long as it's valid
		do { try {
			System.out.println("Please give the text file name:");
			String fileRead = keyboard.nextLine();
			File file = new File(fileRead);
			nums = new Scanner(file);
			invalid = false;
		}
		//If not valid, tries with a different filename
		catch(FileNotFoundException e) {
			System.out.println("ERROR: Invalid filename");
		} } while(invalid);	
		return nums;
	}

/**
 * This method gets the integer to add to the numbers
 * and makes sure it's valid
 * @param keyboard The keyboard Scanner
 * @return Returns the value to add
 */
	private static int getInt(Scanner keyboard)
	{
		int value = 0;
		boolean invalid = true;
		
		//Gets an integer from the user
		do { try {
			System.out.println("Please enter an integer "
							 + "number to add to the values:");
			value = keyboard.nextInt();
			invalid = false;
		//If not an integer, gets another valid input
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Not an integer, invalid input.");
			keyboard.next();
			invalid = true;
		} }while(invalid);
		
		return value;
		
	}

/**
 * This method reads in the integers, converts them
 * to strings, and outputs them to the binary file
 * @param keyboard The keyboard Scanner
 * @param nums The integer Scanner
 * @param outputFile The Output File
 * @param value The value to add
 * @return Returns the boolean to check whether to prompt a different file
 */
	private static void write(Scanner keyboard, Scanner nums,
							  DataOutputStream outputFile, int value)
	{
		String strNum = null;
		int num = 0;
		
		System.out.println("Reading, converting, and writing numbers...");
		
		//Converts and outputs the integers
		while(nums.hasNext())
		{
			//Receives the next line in the file and tokenizes it
			String strNums = nums.nextLine();
			String[] tokens = strNums.split(" ");
			
			//Checks each token to see if it's an integer
			for(int i=0; i<tokens.length;i++) {
				try{num = Integer.parseInt(tokens[i]);
					num = num + value;
					strNum = Integer.toString(num);
					//If it is an integer, writes it to the file
					try {
						outputFile.writeUTF(strNum);
					} catch (IOException e) {}
				} catch (NumberFormatException e) {
				} 
			}		
		}
	}
}

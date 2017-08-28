package basicInputOutput.controller;
import java.util.Scanner;

public class BasicIOController
{
	private String firstName = " ";
	private String lastName = " ";
	
	/*
	 *  Constructor for BasicIOController
	 *  @param first
	 *  @param last
	 */
	
	
	public BasicIOController (String first, String last)
	{
		firstName = first;
		lastName = last;
	}
	
	public void printGreeting ()
	{
				System.out.println("Hello, " + firstName + " " + lastName);
				Scanner myScanner = new Scanner(System.in);
				String response = myScanner.nextLine();
				System.out.println(response);
	}
}

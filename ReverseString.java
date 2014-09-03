/*
	Author: dchhouen
	Usage: Reverse a string from console
*/
import java.util.Scanner;

class ReverseString
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String enteredValue = input.nextLine();
		StringBuffer sb = new StringBuffer(enteredValue);
		System.out.println("Original String: " + sb + "\nReversed String: " +sb.reverse());
	}

}
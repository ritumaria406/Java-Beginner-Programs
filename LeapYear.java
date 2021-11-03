import java.util.Scanner;


public class LeapYear{
	public static void main(String[] args) {
		

		// Fetch input from the user
		System.out.println("Input");
		Scanner nw = new Scanner(System.in);
		int year = nw.nextInt();

		//Logic to check if its a leap year and display message
		if( (year % 400 == 0) || (year % 4 == 0 && year % 100 !=0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
import java.util.Scanner;

public class PrimeOrComposite{
	public static void main(String [] args)
	{

		//Fecthing value
		System.out.println("Enter the value");
		Scanner nw = new Scanner(System.in);
		int numberValue = nw.nextInt();

		//switch case starts
		switch(numberValue)
		{
			case 1 : System.out.println("neither prime nor composite");
			break;
			case 2 : System.out.println("no is prime");
			break;
			case 4 : System.out.println("no is composite");
			break;
			default : System.out.println("not a valid option");

		}
	}
}
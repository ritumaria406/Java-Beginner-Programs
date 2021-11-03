import java.util.Scanner;

public class Calculator{
	public static void main(String[] args)
	{
		System.out.println("Enter first number");
		Scanner nw = new Scanner(System.in);
		int number1 = nw.nextInt();

		System.out.println("Enter second number");
		int number2 = nw.nextInt();

		System.out.println("Enter the option for calculator");
		System.out.println("1 → addition");
		System.out.println("2 → subtraction");
		System.out.println("3 → multiplication");
		System.out.println("4 → division");

		int option = nw.nextInt();
		switch(option)
		{
			case 1:
				System.out.println(number1 + number2);
				break;
			case 2:
				System.out.println(number1 - number2);
				break;
			case 3:
				System.out.println(number1 * number2);
				break;
			case 4:
				if(number2 == 0)
				{
					System.out.println("Second number is zero");
					break;
				}
				System.out.println(number1 / number2);
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
import java.util.Scanner;

public class SwitchDemo
{
	public static void main(String[] args) {
		
		System.out.println("Enter the day value");
		Scanner nw = new Scanner(System.in);
		int dayValue = nw.nextInt();
		switch(dayValue)
		{
			case 0 :
			System.out.println("Sunday");
			break;
			case 1 :
			System.out.println("Monday");
			break;
			case 2 :
			System.out.println("Tuesday");
			break;
			case 3 :
			System.out.println("Wednesday");
			break;
			case 4 :
			System.out.println("Thursday");
			break;
			case 5 :
			System.out.println("Friday");
			break;
			case 6 :
			System.out.println("Saturday");
			break;
			default :
			System.out.println("Not a valid input");
			break;
		}

	}
}
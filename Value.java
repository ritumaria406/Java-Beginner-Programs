import java.util.Scanner;

public class Value{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = in.nextInt();
		if (age > 18)
		{
		System.out.println("You can vote");
		}
		else
		{
		System.out.println("You can't vote");
		}
	}
}
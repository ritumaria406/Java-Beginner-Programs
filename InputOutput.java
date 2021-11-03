import java.util.Scanner;

public class InputOutput{
	public static void main(String[] args)
	{
		System.out.println("Enter integer value");
		Scanner nw = new Scanner(System.in);
		 int value = nw.nextInt();
		 System.out.println(value);

		 System.out.println("Enter float value");
		 float value2 = nw.nextFloat();
		  System.out.println(value2);

		 System.out.println("Enter char value");
		 char value3 = nw.next().charAt(0);
		  System.out.println(value3); 

		  System.out.println("Enter double value");
		 double value4 = nw.nextDouble();
		  System.out.println(value4);

		  System.out.println("Enter boolean value");
		 boolean value5 = nw.nextBoolean();
		  System.out.println(value5);
	}
}
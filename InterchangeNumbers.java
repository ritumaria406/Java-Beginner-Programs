import java.util.Scanner;

public class InterchangeNumbers{
	
/** 
 
 This program is to interchange the numbers

 */

	public static void main(String[] args) {
		Scanner nw = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = nw.nextInt();
		System.out.println("Enter the second number");
		int num2 = nw.nextInt();

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.print("Number 1 is ");
		System.out.println(num1);
		System.out.print("Number 2 is ");
		System.out.println(num2);
	}
	
}
import java.util.Scanner;


public class EvenNumberOrNot {
	public static void main(String[] args) {
		System.out.println("Input");
		
		Scanner nw = new Scanner(System.in);
		int number = nw.nextInt();
		System.out.println("Output");
		if(number%2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}
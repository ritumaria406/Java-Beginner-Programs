import java.io.*;
import java.util.Scanner;

public class EvenOrNot{
	public static void main(String[] args)
	{
		//System.out.println("Enter the number to check even or odd:");
		//Scanner scn = new Scanner();
		int num = 5;
		String result = (num % 2) == 0 ? "Even number" : "Odd number";
		System.out.println(result);
	}
}
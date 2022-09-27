package Problem1;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args) 
	{
		Double a,b;
		String typeOfOperation;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a = s.nextDouble();
		System.out.println("Enter the Second Number");
		b = s.nextDouble();
		System.out.println("Enter the type of operation");
		typeOfOperation = s.next();
		switch(typeOfOperation) 
		{
		case "add":
			System.out.println("Addition: "+(a+b));
			break;
		case "sub":
			System.out.println("Subtraction: "+(a-b));
			break;
		case "mul":
			System.out.println("Multiplication: "+(a*b));
			break;
		case "div":
			System.out.println("Division: "+(a/b));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}
}


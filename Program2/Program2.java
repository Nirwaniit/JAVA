package Program2;

import java.util.Scanner;

public class Program2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int n = 1;
		for(int i = 1;i<=a;i++) {
			System.out.println(n);
			n=n+2;
		}
		
	}
}
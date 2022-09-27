package Program4;

import java.util.Scanner;


public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		System.out.println("Enter the numbers");
		int[] a = new int[n];
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0;
		int i;
		for(i = 0;i<n;i++) 
		{
			a[i] = s.nextInt();
		}
		for(int b:a) 
		{
			if(b%2==0) 
			{
				count1++;
			}
		}
		for(int b:a) 
		{
			if(b%3==0) 
			{
				count2++;
			}
		}
		for(int b:a) 
		{
			if(b%4==0) 
			{
				count3++;
			}
		}
		for(int b:a) 
		{
			if(b%5==0) 
			{
				count4++;
			}
		}
		for(int b:a) 
		{
			if(b%6==0) 
			{
				count5++;
			}
		}
		for(int b:a) 
		{
			if(b%7==0) 
			{
				count6++;
			}
		}
		for(int b:a) 
		{
			if(b%8==0) 
			{
				count7++;
			}
		}
		for(int b:a) 
		{
			if(b%9==0) 
			{
				count8++;
			}
		}
		System.out.println("1:"+a.length+"  "+"2:"+count1+"  "+"3:"+count2+"  "+"4:"+count3+"  "+"5:"+count4+"  "
							+"6:"+count5+"  "+"7:"+count6+"  "+"8:"+count7+"  "+"9:"+count8);	
	}
}
package Day3;

import java.util.Scanner;

public class Triangle {
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter side 1 : ");
		int a = sc.nextInt();
		System.out.print("enter side 2 : ");
		int b =sc.nextInt();
		System.out.print("enter side 3 : ");
		int c =sc.nextInt();
		
		if(a==b && a==c)
		{
			System.out.println("this is Equilateral");
		}
		else if (a==b || a==c||b==c)
		{
			System.out.println("this is Isosceles");
		}
		else
		{
			System.out.println("it is  a scalene");

		}


}}

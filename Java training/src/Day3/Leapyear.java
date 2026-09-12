package Day3;

import java.util.Scanner;

public class Leapyear {
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the year: ");
		int a = sc.nextInt();
		if(a%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");

		}
}
}
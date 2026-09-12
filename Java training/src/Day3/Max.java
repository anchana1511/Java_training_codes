package Day3;

import java.util.Scanner;

public class Max {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the a value: ");
	int a = sc.nextInt();
	System.out.print("Enter the b value:  ");
    int b = sc.nextInt();
    System.out.print("enter the c value: ");
	int c = sc.nextInt();
	if(a<b && b>c)
	{
		System.out.println("b is the greatest number");
	}
	else if (a<b && a<c)
	{
		System.out.println("a is the greatest number");
	}
	else if (c>a && c>b)
	{
		System.out.println(" c is the greatest number");

	}
	else 
	{
		System.out.println("invalid number");

	}
}}

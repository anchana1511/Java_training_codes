package Program;

import java.util.Scanner;

public class Odd {
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num: ");
		int r = sc.nextInt();
		System.out.println(r%2==0);
}}

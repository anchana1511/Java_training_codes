package Program;

import java.util.Scanner;

public class Firstdigit {
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 2 digit number : ");
		int num = sc.nextInt();
		System.out.println("the firstdigit: " + (num/10));
		System.out.println("the lastdigit: " + (num%10));

}}

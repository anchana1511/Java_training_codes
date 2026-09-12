package Program;

import java.util.Scanner;

public class Reverse {
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 2 digit number : ");
		int num = sc.nextInt();
		int b= (num%10)*10+num/10;
		System.out.println("the firstdigit: " + (num/10));
		System.out.println("the lastdigit: " + (num%10));
		System.out.println("the reverse order of the 2 digit number is:"+ b);

}}



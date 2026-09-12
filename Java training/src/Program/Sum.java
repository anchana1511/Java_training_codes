package Program;

import java.util.Scanner;

public class Sum {
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 3 digit number : ");
		int num = sc.nextInt();
		int b= (num%100)+(num/10)%10+num/10;
		System.out.println("the firstdigit: " + (num/100));
		System.out.println("the firstdigit: " + (num/10)%10);
		System.out.println("the lastdigit: " + (num%10));
		System.out.println("the sum of the 3 digit number is:"+ b);

}}


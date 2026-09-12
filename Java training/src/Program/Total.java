package Program;

import java.util.Scanner;

public class Total {
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the subject1 mark: ");
		int sub1 = sc.nextInt();
		System.out.print("enter the subject2 mark: ");
		int sub2 = sc.nextInt();
		System.out.print("enter the subject3 mark: ");
		int sub3 = sc.nextInt();
		System.out.print("enter the subject4 mark: ");
		int sub4 = sc.nextInt();
		System.out.print("enter the subject5 mark: ");
		int sub5 = sc.nextInt();
		float total =sub1+sub2+sub3+sub4+sub5;
		System.out.println("the final total marks: "+(total));
	    System.out.println("the average marks: " + (total/5) );
	    System.out.println("the percentage of the marks: "+(total/500)*100);
		
		
		
		
}}

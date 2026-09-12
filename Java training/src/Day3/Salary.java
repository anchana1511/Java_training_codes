package Day3;

import java.util.Scanner;

public class Salary {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your annual income : ");
		int a = sc.nextInt();
		if(a<=250000)
		{
			System.out.println("no tax");
		}
		else if((a>=250000) &&(a<=500000))
		{
			System.out.println("5% tax");
		}
		else if ((a>=500000) &&(a<=1000000))
		{
			System.out.println("20% tax");
		}
		else if (a>=1000000)
		{
			System.out.println("30% tax");
		}
		else 
		{
			System.out.println("no tax");
		}
}}

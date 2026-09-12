package Day5;

import java.util.Scanner;

public class Sums {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	/*	System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=i-1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*n-(2*i-1);j++)
			{
				System.out.print("*");
			}
			
			System.out.println(); 
			
		
		}   
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}   
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=i-1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*n-(2*i-1);j++)
			{
				System.out.print("*");
			}
			
			System.out.println(); 
				}
		
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}  
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 for (int j=1;j<=n-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for (int j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 for (int j=i-1;j>=1;j--)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		}
		
		
		

		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=n-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
			
		}   
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=i-1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*n-(2*i-1);j++)
			{
				System.out.print(j);
			}
			
			System.out.println(); 
				}
		
		
		*/
		
		int a=5;
		int b=8;
		int c=3;
		if((a+b)>c)
		{
			c=a+b;
		}
		if (b%2==0)
		{
			a=b-c;
		}
		else{
			a=a+c;
		}
          System.out.print(a+b+c);

	}}

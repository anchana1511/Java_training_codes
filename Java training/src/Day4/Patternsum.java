package Day4;

import java.util.Scanner;

public class Patternsum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}    
		
		
		
		
		
		System.out.println("enter the number : ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}   
		
		
		System.out.println("enter the number : ");
		int b=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}    
		
		
		
		System.out.println("enter the number : ");
		int c=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=a-i;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		} 
		
		
		
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=i-1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
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
		
		
		*/
		
		
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
		
		
		
}
}


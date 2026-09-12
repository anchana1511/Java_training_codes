package Day4;
import java.util.Scanner;
public class Forloop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("reverse oder");
		for ( int a=10;a>=0;a--)
		{
			System.out.println(a);
		}
		
		
		System.out.println("even numbers");
		for(int b=0;b<=20;b++)
		{
			if(b%2==0)
			{
				System.out.println(b + " ");
			}
		}

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int c=sc.nextInt();
		for(int r=0;r<=10;r++)
		{
			System.out.println(c + "*"+r + "=" + (c*r));
		}
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("divisible by 3 form 1 to n ");
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int t=1;t<=n;t++)
		{
			if (t%3==0)
			{
				System.out.print(t + " ");
			}
		}
		

		Scanner sc= new Scanner(System.in);
		System.out.println("sum of natural num from 1 to n ");
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int a=0;
		for (int i=1;i<=n;i++)
		{
			a=a+i;
		}
		System.out.println(a);
		
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("factorial of number from 1 to n ");
		System.out.println("Enter the number: ");
		long n=sc.nextLong();
		long a=1;
		for (long i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);
		
	
		
	
       
        
        
		Scanner sc= new Scanner(System.in);
		System.out.println("the factor of  number from 1 to n ");
        System.out.println("enter the number: ");
		int n= sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+ " ");
			}
		}
        
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("the prime numbers from 1 to n ");
        System.out.println("enter the number: ");
		int n= sc.nextInt();
		count=0;
		for (int i=1;i<=n;i++)
		{
			if( n%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not  a prime number");

		}
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("the fibonacci series  from 1 to n ");
        System.out.print("enter the number: ");
		int n= sc.nextInt();
		int f=0;
		int s=1;
		
		for( int i=1;i<=n;i++)
		{
			System.out.println("the fibonacci series are :"+ f +" ");
			int a= f+s;
			 f=s;
			 s=a;
		}
	
		
		
		
	
		
	
	}
	}
	

    


       
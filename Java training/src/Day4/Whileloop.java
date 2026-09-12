package Day4;

import java.util.Scanner;

public class Whileloop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the number: ");
			int n= sc.nextInt();
	        int count=0;
	        while (n!=0)
	        {
	        	n=n/10;
	        	count++; 	
	        } 
	        
	        System.out.println("the  given number is palindrome or not  ");
	        System.out.print("enter the number: ");
			int n= sc.nextInt();
			int h=n;
			int reverse=0;
			while(h!=0)
			{
				reverse=reverse*10 + h%10;
				h/=10;
			}
			if(n==reverse)
			{
				System.out.println("it is palindrome");
			}
			else 
			{
				System.out.println("it is not a palindrome");

			}
			
	        
	        
	        
	        
	        
	        
}}

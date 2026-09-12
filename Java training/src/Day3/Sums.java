package Day3;
import java.util.Scanner;
public class Sums {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number  : ");
		int num1 = sc.nextInt();
		if ((num1%3==0)&& (num1%5==0))
		{
			System.out.println(" fizz biss");
			
		}
		else if(num1%5==0)
		{
			System.out.println("fizz");
		}
		else if(num1%3==0)
		{
			System.out.println(" biss");
		}
		else 
		{
			System.out.println("the number is not divided");
		}
		
	}
}

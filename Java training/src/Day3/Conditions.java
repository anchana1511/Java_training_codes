package Day3;
import java.util.Scanner;
public class Conditions {
	public static void main(String[]args)
	{
		System.out.println("calculate the number by using if statement");
		int num=89;
		if (num>0)
		{
			System.out.println("The give number is positive");
		} 

		
		
		System.out.println("calculate the number which is even or odd by using if else");
		int num2=28;
		if (num2%2==0)
		{
			System.out.println("the given number s even ");
		}
		else
		{
			System.out.println("the given number is odd");
		}
		
		
		
		System.out.println("calculate the number by using if statement");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number  : ");
		int num3 = sc.nextInt();
		if(num3>0)
		{
			System.out.println("The given number is positive");
		}
		
		
		System.out.println("calculate the number by using if statement");
		System.out.print("enter the number  : ");
		int num5 = sc.nextInt();
		
		if(num5<0)
		{
			System.out.println("The given number is negative");
		}
		
		
		
		System.out.println("calculate the number which is even or odd by using if else");
		System.out.print("enter the number  : ");
		int num4 = sc.nextInt();
		
		if(num4%2==0)
		{
			System.out.println("The given number is EVEN");
		}
		else
		{
			System.out.println("The given number is ODD");

		}
		
		
		
		System.out.println("calculate the grade by using else if ladder");
		int mark=90;
		if(mark>=90)
		{
			System.out.println("Grade A");
		}
		else if ( mark>=75)
		{
			System.out.println("Grade B");

		}
		else if (mark>=50)
		{
			System.out.println("Grade c");

		}
		else
		{
			System.out.println("Fail");
		}
		
		sc.nextLine();
		
		System.out.println("enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter the password:  ");
	    String password = sc.nextLine();
		if (username.equals("Anchana"))
		{
			if(password.equals("Ragul"))
			{
			System.out.println("login page open successfully");
			}
			else
			{
				System.out.println("invalid user");

			}
		}
		
		
		System.out.println("days calculation by using switch case");
		int day=5;
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("monday");
            break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
		    System.out.println("thrusday");
		    break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("there is no days avaliable");
			break;

		}
		
	}  
}
 
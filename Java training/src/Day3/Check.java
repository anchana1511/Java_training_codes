package Day3;
import java.util.Scanner;
public class Check {
public static void main (String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the a value: ");
	char ch = sc.next().charAt(0);
	int a =ch;
	if(a>=65 && a<=90)
	{
		System.out.println("the given character is upper case");
	}
	else if(a>=97 && a<=122)
	{
		System.out.println("the given character is lower case");
	}
	else if(a>=48 && a<=57)
	{
		System.out.println("the given character is digit ");
	}
	else
	{
		System.out.println("the given character is some other element");

	}
}
}

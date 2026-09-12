package Day3;
import java.util.Scanner;
public class Calculator {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a value : ");
	int a = sc.nextInt();
	System.out.print("enter b value : ");
	int b =sc.nextInt();
	sc.nextLine();
	System.out.println("which operator to perform: ");
	String ope = sc.nextLine();
	switch(ope)
	{
	case "+":
		System.out.println("Addition: " + (a+b));
		break;
	case "-":
		System.out.println("subtraction: " + (a-b));
        break;
	case "*":
		System.out.println("multiple: " + (a*b));
		break;
	case "/":
		System.out.println("division: " + (a/b));
		break;
	case "%":
		System.out.println("modulus: " + (a%b));
	    break;
	
	default:
		System.out.println("there is no operation avaliable");
		break;

}}}

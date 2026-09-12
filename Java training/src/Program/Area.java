package Program;

import java.util.Scanner;

public class Area {
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of length: ");
		int length= sc.nextInt();
		System.out.print("enter the value of breadth: ");
		int breadth= sc.nextInt();
		System.out.println("the area of the rectangle: "+ (length*breadth));
		System.out.println("the perimeter  of the rectangle: "+ (2*(length+breadth)));

		 
}
}
package Program;
import java.util.Scanner;
public class Operator {
	public static void main (String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number: ");
		int a= sc.nextInt();
		System.out.print("enter the number: ");
		int b= sc.nextInt();
		 
		System.out.println("Addition:  "+ (a+b));
		System.out.println("subtraction:  "+ (a-b));
		System.out.println("multplication:  "+ (a*b));
		System.out.println("division:  "+ (a/b));
		System.out.println("modular:  "+ (a%b));
		
		System.out.println("\n Relational operator:");
		System.out.println("(a<b): " +(a<b));
		System.out.println("(a>b): " +(a>b));
		System.out.println("(a==b): " +(a==b));
		System.out.println("(a!=b): " +(a!=b));
		System.out.println("(a<=b): " +(a<=b));
		System.out.println("(a>=b): " +(a>=b));
        
		
		System.out.println("\nAssignment operator:");
		System.out.println("Strating value of 'a' : " + a);
		a+=10;
		System.out.println(" a+=10: " + a );
		a-=5;
		System.out.println(" a-=5: " + a );
		a*=3;
		System.out.println(" a*=3: " + a );
		a/=4;
		System.out.println(" a/=4: " + a );
		a%=8;
		System.out.println(" a%=8: " + a );

		System.out.println("\n Logical operator:");
		System.out.println("((a<b)&& (a<45)): " + ((a<b)&& (a<45)));
		System.out.println("(a>=b)||(b<a)): " +((a>=b)||(b<a)));
		System.out.println("(!(a<45)): " +(!(a<45)));
		
		System.out.println("\n Bitwise operator:");
		System.out.println("(a&b): " +(a&b));
		System.out.println("(a|b): " +(a|b));
		System.out.println("(a^b): " +(a^b));
		System.out.println("(~a): " +(~a));
		System.out.println("(a>>1): " +(a>>1));
		System.out.println("(a<<1): " +(a<<1));
        

		System.out.println("\n Unary operator:");
		int c=20;
		System.out.println("starting value of c: " + c);
		System.out.println("(++c): " + ++c);
		System.out.println("(--c): " + --c);
		System.out.println("(c++): " + c++);
		System.out.println("(c--): " + c--);
		
		
		
        
	}
}

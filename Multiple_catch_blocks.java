import java.util.*;
public class Multiple_catch_blocks
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		    System.out.print("Enter number1: ");
		    int a=sc.nextInt();
		    System.out.print("Enter number2: ");
		    int b=sc.nextInt();
		    System.out.println(a+"/"+b+"="+(a/b));
		}
		catch(ArithmeticException ae){
		    System.out.println("Error: "+ae);
		}
		catch(InputMismatchException ie){
		    System.out.println("Error: "+ie);
		}
	}
}
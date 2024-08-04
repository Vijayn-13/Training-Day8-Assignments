import java.util.*;
public class Arithmetic_exception
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		    System.out.print("Enter a number to divide 100: ");
		    int n=sc.nextInt();
		    System.out.println(100/n);
		}
		catch(ArithmeticException ae){
		    System.out.println("Error: "+ae);
		}
	}
}
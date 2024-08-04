import java.util.*;
public class Exception_hierarchy
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		    System.out.print("Enter number1: ");
		    int a=sc.nextInt();
		    System.out.print("Enter number2: ");
		    int b=sc.nextInt();
		    System.out.println(a+"/"+b+"="+(a/b));
		    String str=null;
		    System.out.println("String length: "+str.length());
		    System.out.println("Substring: "+str.substring(0,5));
		}
		catch(ArithmeticException ie){
		    System.out.println("Error occurred: "+ie);
		}
		catch(NullPointerException ne){
		    System.out.println("Error occurred: "+ne);
		}
		catch(Exception e){
		    System.out.println("Error occurred: "+e);
		}
	}
}
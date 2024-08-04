import java.util.*;
class NegativeNumberException extends RuntimeException{
    NegativeNumberException(String msg){
        super(msg);
    }
}
public class Custom_unchecked_exception
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		    System.out.print("Enter number: ");
		    int a=sc.nextInt();
		    if(a<0){
		        throw new NegativeNumberException("Negative number is entered");
		    }
		    else{
		        System.out.println("Input integer value is Valid");
		    }
		}
		catch(NegativeNumberException ie){
		    System.out.println("Error: "+ie.getMessage());
		}
	}
}
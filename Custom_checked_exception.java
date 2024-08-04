import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class Custom_checked_exception
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		    System.out.print("Enter age: ");
		    int a=sc.nextInt();
		    if(a<18){
		        throw new InvalidAgeException("User entered age is less than 18");
		    }
		    else{
		        System.out.println("Age is verified");
		    }
		}
		catch(InvalidAgeException ie){
		    System.out.println("Error: "+ie.getMessage());
		}
	}
}
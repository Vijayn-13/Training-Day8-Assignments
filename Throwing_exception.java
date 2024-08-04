import java.util.*;
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String msg){
        super(msg);
    }
}
class Banking{
    String acc_no;
    double balance;
    Banking(String acc_no,double balance){
        this.acc_no=acc_no;
        this.balance=balance;
    }
    void withdraw(double amt) throws InsufficientFundsException{
        if(this.balance>=amt){
            this.balance-=amt;
            System.out.println("Debited amount: "+amt);
        }
        else{
            throw new InsufficientFundsException("Insufficient amount balance");
        }
    }
}
public class Throwing_exception
{
	public static void main(String[] args) {
		Banking b1=new Banking("vijay1234",23500);
		Banking b2=new Banking("mahi2345",12000);
		try{
		    b1.withdraw(10000);
		    b2.withdraw(15000);
		}
		catch(InsufficientFundsException ie){
		    System.out.println("Error: "+ie.getMessage());
		}
	}
}
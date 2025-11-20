import java.util.*;
class Account{
    int accn;
    String name;
    double bal;

    Account(int accn, String name, double bal){
        this.accn=accn;
        this.name=name;
        this.bal=bal;
    }

    void withdraw(double amount) throws InsufficentException{
        if (amount<=0){
           throw new IllegalArgumentException("Amount should be positive");
        }
        if (amount>bal){
            throw new InsufficentException("Insufficient Balance");
        }
        bal = bal - amount;
    }
}

class InsufficentException extends Exception{
    InsufficentException(String msg){
        super(msg);
    }
}
public class exce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account(1001,"John",50000.0);
        double amount = 0;
        try {
            a1.withdraw(amount);
            System.out.println("Withdrawl Success");
        } catch (InsufficentException e) {
            System.out.println("Error: "+e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Completed");
        }
    }
    
}

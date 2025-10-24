class BankAccount{
    double balance;

    void deposit(double amount){
        balance+=amount;
        System.out.println("Current Balance = "+balance);
    }

    void withdraw(double amount){
        balance-=amount;
        System.out.println("Current Balance = "+balance);
    }

    void displayBalance(){
        System.out.println("Current Balance = "+balance);
    }
}

class SavingsAccount extends BankAccount{
    double interestRate=10;

    void addInterest(){
        balance=balance+((interestRate*balance)/100);
    }
}

public class inherprac{
    public static void main(String[] args){
        SavingsAccount S1 = new SavingsAccount();
        S1.balance=50000;
        S1.deposit(1000);
        S1.withdraw(5000);
        S1.addInterest();
        S1.displayBalance();
    }
    
}
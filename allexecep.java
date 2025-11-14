/* Write a Java program to simulate a basic bank withdrawal system using exception handling. 
The program should ask the user to enter an account number, an initial balance, and an amount to withdraw. 
Use a Scanner to read inputs and handle input-related errors such as entering letters instead of 
numbers using InputMismatchException. Create a custom checked exception named InsufficientBalanceException 
that is thrown when the withdrawal amount is greater than the available balance. Implement a BankAccount
class with a constructor and a withdraw(double amount) method that uses the throws keyword and throws the 
custom exception when necessary. In the main method, use try–catch–finally blocks to handle both input errors 
and the custom exception, ensuring that a message like “Transaction Completed” is printed in a finally block 
whether the withdrawal succeeds or fails. The program must display a successful withdrawal message showing the 
remaining balance or an appropriate error message when an exception occurs.*/ 



import java.util.*;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private String accNo;
    private double balance;

    // Constructor
    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Withdraw method (throws checked exception)
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful! Remaining Balance: " + balance);
    }
}

public class allexcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ac;
        double ib = 0;
        double amount = 0;

        try {
            System.out.println("Enter Account Number: ");
            ac = sc.nextLine();

            System.out.println("Enter Initial Balance: ");
            ib = sc.nextDouble();

            System.out.println("Enter Amount to Withdraw: ");
            amount = sc.nextDouble();

            BankAccount b = new BankAccount(ac, ib);

            try {
                b.withdraw(amount);   // might throw custom exception
            }
            catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Transaction Completed.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Wrong Datatype Entered!");
        }

        sc.close();
    }
}

import java.util.Scanner;
class atm{
    public static void main(String[] args){
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        int balance=50000;
        int opt=0;
        while(opt!=4){
            System.out.println("\nMenu\n1.Withdrawl\n2.Deposit\n3.Check Balance\n4.Exit");
            System.out.println("Enter Your Option: ");
            int op=sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Enter Amount: ");
                    int wd = sc.nextInt();
                    if(wd>balance){
                        System.out.println("Insufficent Balance");
                    }else{
                        balance=balance-wd;
                    }
                    
                    System.out.println("Current Balance = "+balance);
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    int de = sc.nextInt();
                    balance=balance+de;
                    System.out.println("Updated Balance = "+balance);
                    break;
                case 3:
                    System.out.println("Updated Balance = "+balance);
                    break;
                case 4:
                    opt=4;
                    break;
                default: 
                    System.out.println("Enter correct option");

            }
        }
    }
}
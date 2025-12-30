import java.util.Scanner;

abstract class Order{
    String orderid;
    String name;
    double amount;

    Order(String orderid, String name, double amount){
        this.orderid=orderid;
        this.name=name;
        this.amount=amount;
    }

    abstract double calculateFinalAmount();

    void display(){
        System.out.println("Order ID: " + orderid);
        System.out.println("Customer: " + name);
        System.out.println("Base Amount: " + amount);
        System.out.println("Final Amount: " + calculateFinalAmount());
    }
}

class regular extends Order{
    regular(String id, String name, double amount) {
        super(id, name, amount);
    }
    double calculateFinalAmount(){
        return amount + 50;
    }
}

class express extends Order{
    express(String id, String name, double amount) {
        super(id, name, amount);
    }
    double calculateFinalAmount(){
        double discount=0;
        if (amount > 500){
            discount = amount / 10;
        }
        return amount - discount + 100;
    }
}

class bulk extends Order{
    bulk(String id, String name, double amount){
        super(id,name,amount);
    }
    double calculateFinalAmount(){
        double discount=0;
        if(amount>1000){
            discount = amount*0.15;
        }
        return amount - discount;
    }
}
public class orderoop {
    public static void main(String[] args) {
        Order o1 = null;
        Scanner sc =  new Scanner(System.in);

        String ordid;
        String name;
        double amount;

        System.out.println("Enter Order Type(1-Regular / 2-Express / 3-Bulk)");
        int ordertype = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter OrderID:");
        ordid=sc.nextLine();

        System.out.println("Enter Customer Name:");
        name=sc.nextLine();

        System.out.println("Enter Base Amount:");
        amount=sc.nextDouble();

        switch(ordertype){
            case 1:
                o1 = new regular(ordid,name,amount);
                break;
            case 2:
                o1 = new express(ordid,name,amount);
                break;
            case 3:
                o1 = new bulk(ordid,name,amount);
                break;
            default:
                System.out.println("Invalid Order Type");
                
        }
        System.out.println("Bill Details");
        o1.display();
    }
}

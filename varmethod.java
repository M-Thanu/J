import java.util.Scanner;

class product{
    String name;
    double price;
    double discount;
    double tax;
    static int billcount=0;

    double calculatediscount(){
        return (discount*price)/100;   
    }

    double calculatetax(){
        return (tax*price)/100;
        
    }

    double calculateFinal(){
        double cd=calculatediscount();
        double ct=calculatetax();
        double fp = (price + ct) - cd;
        return fp;
    }

    static void incrementbill(){
        billcount++;
    }

    void printSummary(double fp){
        System.out.println("Product : "+name);
        System.out.println("Price: "+fp);
        System.out.println("Bills Generated: "+billcount);
    }

}
public class varmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product: ");
        String pd = sc.nextLine();
        System.out.println("Enter price: ");
        double pr = sc.nextDouble();
        //sc.nextLine();
        System.out.println("Enter Discount: ");
        double ds = sc.nextDouble();
        //sc.nextLine();
        System.out.println("Enter tax: ");
        double tx = sc.nextDouble();
        
        product p = new product();
        p.name=pd;
        p.price=pr;
        p.discount=ds;
        p.tax=tx;

        double finalp = p.calculateFinal();

        product.incrementbill();

        p.printSummary(finalp);


        


    }
}


import java.util.Scanner;
public class cookiekiosk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ord=0;
        int total=0;
        System.out.println("Our Kiosk\n");
        System.out.println("Enter your role ID (1 - Employee / 2 - Intern): ");
        int role=sc.nextInt();
        System.out.println("1.Coffee - Rs.150\n2.Sandwich - Rs.250\n3.Juice - Rs.120\n4.Exit");
        while(ord != 4){
            System.out.println("Enter your choice : ");
            ord=sc.nextInt();
            switch(ord){
                case 1:
                    total+=150;
                    break;
                case 2:
                    total+=250;
                    break;
                case 3:
                    total+=120;
                    break;
                case 4:
                    System.out.println("Total Amount : Rs."+total);
                    break;
                default:
                    System.out.println("Enter correct choice");
            }
        }
        if(total>500){
            System.out.println("\nCookie Winner");
        }
        if(role==2){
            total=total-(total/10);
            System.out.println("\nYou are eligible for discount");
            System.out.println("\nAmount you need to pay : Rs."+total);
        }else{
            System.out.println("\nAmount you need to pay : Rs."+total);
        }
        
    }
}

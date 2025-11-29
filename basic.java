import java.util.Scanner;
public class basic {
    public static void main(String[] args){
        int con=1;
        Scanner sc = new Scanner(System.in);
        int total=0;
        while(con==1){
            System.out.println("Welcome to Kissik");
            System.out.println("\n1.Scan an Item\n2.View Total\n3.Apply Discount\n4.Proceed Payment\n5.Exit");
            System.out.println("\nEnter your choice: ");
            int fc = sc.nextInt();
                switch(fc){
                    case 1:
                        while(true){
                            System.out.println("\nItem List");
                            System.out.println("\n1.Pen - 20.00\n2.Pencil - 50.00\n3.Champs - 60.00\n4.Odiclone - 100.00\n5.Chips - 150.00\n6.Stop");
                            System.out.println("\nEnter your choice: ");
                            int ic = sc.nextInt();
                            switch(ic){
                                case 1:
                                    total=total+20;
                                    break;
                                case 2:
                                    total=total+50;
                                    break;
                                case 3:
                                    total=total+60;
                                    break;
                                case 4:
                                    total=total+100;
                                    break;
                                case 5:
                                    total=total+150;
                                    break;
                                case 6:
                                    System.out.println("Stopped");
                                    break;
                                default:
                                    System.out.println("\nSelect correct item");
                            }
                            if(ic==6){break;}
                        }
                        break;
                    case 2:
                        System.out.println("\nCurrent Total : "+total);
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("\nEnter your discount code : ");
                        String code = sc.nextLine();
                        int dc;
                        if(code.equals("SAVE")){
                            dc=total/10;
                            total=total-dc;
                        }else if(code.equals("HALF")){
                            dc=total/2;
                            total=total-dc;
                        }else{
                            System.out.println("No Discounts");
                        }
                        break;
                    case 4:
                        System.out.println("\nYour Bill Amount = "+total);
                        System.out.println("\nEnter Cash: ");
                        int cash=sc.nextInt();
                        if(cash==total){
                            System.out.println("Payment Successful");
                        }else if(cash>total){
                            int bal=cash-total;
                            System.out.println("Your Balance : "+bal);
                        }else{
                            System.out.println("Insufficient Payment amount");
                        }
                        break;
                    case 5:
                        System.out.println("Thank You. Come Again");
                        con=0;
                        break;
                    default:
                        System.out.println("Enteer Correct Choice");
                }
        }
    }
}

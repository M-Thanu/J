import java.util.*;

class Device{
    String name;

    Device(String name){
        this.name=name;
    }

    void turnon(){
        System.out.println("Turning On..");
    }

}

class Fan extends Device{
    Fan(String name){
        super(name);
    }
    
    void turnon(){
        super.turnon();
        System.out.println("Fan turned on");
    }
}

class Light extends Device{
    Light(String name){
        super(name);
    }
    
    void turnon(){
        super.turnon();
        System.out.println("Light turned on");
    }
}

class Door extends Device{
    Door(String name){
        super(name);
    }
    
    void turnon(){
        super.turnon();
        System.out.println("Door turned on");
    }
}

public class home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condition = 0;
        Device cd=null;
        while(condition !=4){
            System.out.println("Smart Home\n1.Add Device\n2.Turn On\n4.Exit");
            condition = sc.nextInt();
            sc.nextLine();

            switch(condition){
                case 1:
                    System.out.println("Select Device:\n1.Fan\n2.Door\n3.Light");
                    int dtype = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name: ");
                    String dname = sc.nextLine();
                    switch(dtype){
                        case 1:
                            cd = new Fan(dname);
                            break;
                        case 2:
                            cd = new Door(dname);
                            break;
                        case 3:
                            cd = new Light(dname);
                            break;
                        default:
                            System.out.println("Enter Correct type");
                            condition = 4;
                    }
                    System.out.println("Device Created Successfully");
                    break;
                case 2:
                    System.out.println("Select Device:\n1.Fan\n2.Door\n3.Light");
                    int tc = sc.nextInt();
                    sc.nextLine();
                    if(tc<1 && tc>3){
                        System.out.println("Enter Correct type");
                        condition = 4;
                    }else{
                        cd.turnon();
                    }
                    break;
                case 3:
                    System.out.println("Doesn't Exist");
                    break;
                case 4:
                    System.out.println("Leaving...");
                    condition=4;
                    break;
                default:
                    System.out.println("Enter Correct type");
                    condition = 4;
            }
        }
    }
    
}

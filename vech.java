import java.util.Scanner;

class Vehicle{
    String vmodel;
    int batterylevel;

    Vehicle(String vmodel,int batterylevel){
        this.vmodel=vmodel;
        this.batterylevel=batterylevel;
    }

    void start(){
        System.out.println("Starting all vehicles");
    }

    void acclerate(){
        System.out.println("Acclerating all vehicles");
    }

    void show(){
        System.out.println("Vehicle Status Report");
    }
}

class Car extends Vehicle{
     void start(){
        System.out.println("Battery Low");
    }

    void acclerate(){
        System.out.println("Speed increased to 30 km/h");
    }

    void show(){
        System.out.println(model+"| Battery :"+batterylevel);
    }
}

class ElectricCar extends Car{
     void start(){
        System.out.println("Battery Low");
    }

    void acclerate(){
        System.out.println("Speed increased to 20 km/h");
    }

    void show(){
        System.out.println(model+"| Battery :"+batterylevel);
    }
}

class SelfDrivingCar extends Car{
     void start(){
        System.out.println("AutoStart");
    }

    void acclerate(){
        System.out.println("Speed increased to 30 km/h");
    }

    void show(){
        System.out.println(model+"| Battery :"+batterylevel);
    }
}

class Bus extends Vehicle{
     void start(){
        System.out.println("Not Starting");
    }

    void acclerate(){
        System.out.println("Speed increased to 30 km/h");
    }

    void show(){
        System.out.println(model+"| Battery :"+batterylevel);
    }
}

class Motorbike extends Vehicle{
     void start(){
        System.out.println("Gear Started");
    }

    void acclerate(){
        System.out.println("Speed increased to 30 km/h");
    }

    void show(){
        System.out.println(model+"| Battery :"+batterylevel);
    }
}

class vech{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        int condition = 1;
        while(condition == 1){
            System.out.println("Smart Transport System");
            System.out.println("\n1.Add vehicle\n2.Start All\n3.Acclerate All\n4.Show Report\n.5.Exit");
            System.out.println("Enter Choice: ");
            c=sc.nextInt();

            switch(c){
                case 1:
                    System.out.println("Select Vehicle Type: \n1.Car\n2.Electric Car\n3.Bus\n4.Motorbike\n5.Self-Driving Car");
                    System.out.println("Choice: ");
                    int vt=sc.nextInt();
                    System.out.println("Enter Model: ");
                    int model=sc.nextLine();
                    System.out.println("Enter Battery Level(0-100): ");
                    int battery=sc.nextInt();
                    switch(vt){
                        case 1:
                            Vehicle c = new Car(model,battery);
                            break;
                        case 2:
                            Vehicle ec = new ElectricCar(model,battery);
                            break;
                        case 3:
                            Vehicle b = new Bus(model,battery);
                            break;
                        case 4:
                            Vehicle m = new Motorbike(model,battery);
                            break;
                        case 5:
                            Vehicle sdc = new SelfDrivingCar(model,battery);
                            break;
                        System.out.println("Vehicle Creaated Successfully");
                    }
                case 2:
                    Vehicle.start();
                    break;
                case 3:
                    Vehicle.acclerate();
                    break;
                case 4:
                    Vehicle.show();
                    break;
                case 5:
                    System.out.println("Leaving from the System");
                    condition=0;
                    break;
                default:
                    System.out.println("Check your choice");
            }
        }
        
    }
}
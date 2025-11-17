import java.util.Scanner;
interface Switchable{
    void turnOn();
    void turnOff();
}

abstract class Appliance implements Switchable{
    abstract void status();
}

class Fan extends Appliance{
    int speed=1;
    String stat;
    public void turnOn(){
        stat="On";
        System.out.println("Fan Turned On");
    }
    public void turnOff(){
        stat="Off";
        System.out.println("Fan Turned Off");
    }

    void changespeed(){
        speed++;
    }

    void status(){
        System.out.println("Fan Status : "+stat+" Speed: "+speed);
    }
}

class Light extends Appliance{
    int br=20;
    String statlt;
    public void turnOn(){
        statlt="On";
        System.out.println("Light Turned On");
    }
    public void turnOff(){
        statlt="Off";
        System.out.println("Light Turned Off");
    }

    void changebright(){
        br+=10;
    }

    void status(){
        System.out.println("Fan Status : "+statlt+" Brightness: "+br+"%");
    }
}

public class ab {
    public static void main(String[] args){
        int c=0;
        Scanner sc = new Scanner(System.in);
        //Appliance a = null;
        while(c!=3){
            System.out.println("Sleect Appliance\n1.Fan\n2.Light");
            System.out.println("Choice: ");
            int ch=sc.nextInt();

            switch(ch){
                case 1:
                    Fan f = new Fan();
                    f.turnOn();
                    f.changespeed();
                    f.status();
                    f.turnOff();
                    break;
                case 2:
                    Light l = new Light();
                    l.turnOn();
                    l.changebright();
                    l.status();
                    l.turnOff();
                    break;
                case 3:
                    System.out.println("Leaving");
                    c=3;
                    
            }
        }
    }
}

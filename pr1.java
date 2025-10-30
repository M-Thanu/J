import java.util.Scanner;
abstract class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    abstract void displayDetails();
}

class Student extends Person{
    int[] marks=new int[5];
    Scanner sc = new Scanner(System.in);
    int in;
    void setmarks(){
        System.out.println("Enter " + this.getName() + "marks: ");
        int i=0;
        while(i<5){
            in = sc.nextInt();
            if(in > 0 && in<100){
                marks[i] = in;
            }else{
                System.out.println("Invalid Range");
                i--;
            }
            i++;
        }
    }
    
    double calAvg(){
        double avg;
        int sum=0;
        for(int i=0; i<5; i++){
            sum=sum+marks[i];
        }
        avg=sum/5;
        return avg;
    }

    @Override
    void displayDetails(){
        System.out.println("Name: " + this.getName() + " Age: " + this.getAge());
    }
}

class pr1{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        String sname;
        int sage;
        Scanner ic = new Scanner(System.in);
        Student[] clsA = {s1,s2,s3};

        for(Student s : clsA){
            System.out.println("Enter name: ");
            sname= ic.nextLine();
            ic.nextLine();
            System.out.println("Enter age: ");
            sage= ic.nextInt();

            s.setName(sname);
            s.setAge(sage);
            s.setmarks();
            s.displayDetails();
            System.out.println("Average: " + s.calAvg());

        }
        //s1.setName("Joe");
        //s1.setAge(21);

        //s1.setmarks();
        //s1.displayDetails();
        //System.out.println("Average: " + s1.calAvg());
    }
}
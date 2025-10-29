abstract class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    void setname(String name){
        this.name=name;
    }

    void setAge(int age){
        if (age>0){
            this.age=age;
        }else{
            System.out.println("Check");
        }
        
    }

    abstract void getRole();

    public void displayInfo(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Student extends Person{
    int sId;
    String course;

    Student(String name, int age, int sId, String course){
        super(name, age);
        this.sId=sId;
        this.course=course;
    }

    @Override
    void getRole(){
        System.out.println("Student");
    }
}

class Professor extends Person{
    int pId;
    String subject;

    Professor(String name, int age, int pId, String subject){
        super(name, age);
        this.pId=pId;
        this.subject=subject;
    }

    @Override
    void getRole(){
        System.out.println("Professor");
    }
}

public class alloop{
    public static void main(String[] args){
        Person p1 = new Student("Alice",21,101,"AI");
        Person p2 = new Professor("John",45,201,"ML");

        p1.getRole();
        p1.displayInfo();
        System.out.println("\n Student ID: "+((Student)p1).sId + "\n Course: "+ ((Student)p1).course);
        p2.getRole();
        p2.displayInfo();
        System.out.println("\n Student ID: "+((Professor)p2).pId + "\n Subject: "+ ((Professor)p2).subject);
        
    }
}
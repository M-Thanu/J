class Employee{
    private String name;
    private int id;
    private double salary;

    public String printEname(){
        return name;
    }

    public int printEid(){
        return id;
    }

    public double printEsalary(){
        return salary;
    }

    public void makeEname(String name){
        this.name=name;
    }

    public void makeEid(int id){
        this.id=id;
    }
    
    public void makeEsalary(double salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Salary can't be negative");
        }
        
    }
}

public class encap{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.makeEname("John");
        e1.makeEid(101);
        e1.makeEsalary(500000.0);

        Employee e2 = new Employee();
        e2.makeEname("Alice");
        e2.makeEid(102);
        e2.makeEsalary(600000.0);

        System.out.println("Employee 1 : Name: " + e1.printEname() + "ID : " + e1.printEid() + "Salary: " + e1.printEsalary());
        System.out.println("Employee 2 : Name: " +  e2.printEname() + "ID : " + e2.printEid() + "Salary: " + e2.printEsalary());
    }
}
import java.util.Scanner;

class Student{
    int SId;
    String name;
    String dep;
    int[] marks;

    Student(int SId, String name, String dep, int[] marks){
        this.SId =SId;
        this.name= name;
        this.dep=dep;
        this.marks=marks;
    }

    void show(){
        System.out.println("Student ID: "+SId);
        System.out.println("\nStudent Name: "+name);
        System.out.println("\nStudent Department: "+dep);
        System.out.println("\nStudent marks: ");
        int sum=0;
        double avg=0.0;
        for (int j=0; j<3; j++){
            System.out.println(marks[j]+"  ");
            sum = sum + marks[j];
        }
        avg = sum/3.0;
        System.out.println("Total: "+sum);
        System.out.println("Average: "+avg);
    }
}

public class arrmul {
    public static void main(String[] args) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        Student[] sds = new Student[5];
        int scount=0;
        while(ch != 4){
            System.out.println("Campus Manager");
            System.out.println("\n1.Add Student\n2.Show All Students\n3.Show Seating\n4.Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Student ID: ");
                    int sid = sc.nextInt();
                    System.out.println("Enter Student Name: ");
                    sc.nextLine();
                    String sname = sc.nextLine();
                    System.out.println("Enter Student Department: ");
                    String sdep = sc.nextLine();
                    System.out.println("Enter 3 marks: ");
                    int[] mar = new int[3];
                    for (int i=0; i<3; i++){
                        mar[i] = sc.nextInt();
                    }
                    if(scount<5){
                        sds[scount] = new Student(sid, sname,sdep, mar);
                        scount++;
                        System.out.println("Student Added");
                    }else{
                        System.out.println("Reached the maximum limit of students");
                    }
                    break;
                case 2:
                    System.out.println("---Student Details---");
                    for(int i=0; i<scount; i++){
                        sds[i].show();
                    }
                    /*for(Student s:sds) {
                        s.show();
                    }*/
                    break;
                case 3:
                    System.out.println("Not yet");
                    break;
                case 4:
                    System.out.println("Log Out");
                    ch=4;
                    break;
                default:
                    System.out.println("Check choice");

            }
        }
    }
}

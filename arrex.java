import java.util.Scanner;
class arrex{
    public static void main(String[] args){
        /*
        int[] marks = new int[5];
        Scanner uin = new Scanner(System.in);
        
        int sum=0;
        double avg=0;
        for(int i=0; i<5; i++){
            System.out.print("Enter marks: ");
            int n=uin.nextInt();
            marks[i]=n;
            sum=sum+marks[i];
        }
        System.out.println("\nTotal : "+sum);
        System.out.println("\nAverage : "+sum/5.0);
        */

       int[] numbers={10,80,8,4};
       System.out.print("Maximum: "+findMax(numbers));
    }

    public static int findMax(int[] num){
        int max=0;
        for(int a:num){
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}
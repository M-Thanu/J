import java.util.Scanner;
import java.util.*;
class excep{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*System.out.println("Enter: ");
        int a = in.nextInt();
        System.out.println("Enter: ");
        int b = in.nextInt();
        try{
            int result=a/b;
            System.out.println("Results: "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
    
        }
        finally{
            System.out.println("Program Completed");
        }*/
       

       /*try{
            System.out.println("Enter Integer: ");
            int a = in.nextInt();
            System.out.println("Integer: "+a);
       }
       catch (InputMismatchException e){
            System.out.println("Input is not an integer");
       }
       finally{
        System.out.println("Program Completed");
       }*/

      int age = in.nextInt();
    try{
      if(age<18){
        /*throw new ArithmeticException("You must be older than 18");*/
        throw new InvalidAgeException();
      }else{
        System.out.println("You can vote");
      }
    }catch (InvalidAgeException e){
        System.out.println(e.m);
    }
      
    }
}

class InvalidAgeException extends Exception{
  String m;
  InvalidAgeException(){
    m="You must be older than 18";
  }
}
import java.lang.*;
import java.util.Scanner;
public class str {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        System.out.println("Enter a word to append: ");
        String w = sc.nextLine();

        System.out.println("Original Sentence : "+s);
        System.out.println("Length : "+s.length());
        System.out.println("Upper Case : "+s.toUpperCase());

        int sin = s.indexOf(' ');
        if(sin==-1){
            System.out.println(s);
        }else{
            System.out.println(s.substring(0, sin));
        }
        

        StringBuilder sb = new StringBuilder(s);
        sb.append(" ").append(w);
        System.out.println("After Appending : "+sb.toString());

        StringBuffer bs = new StringBuffer(s);
        bs.reverse();
        System.out.println("Reversed : "+bs.toString());
    }
}

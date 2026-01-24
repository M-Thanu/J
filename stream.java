import java.io.*;
public class stream {
    public static void main(String[] args) {
        try {
            
            PrintWriter pw = new PrintWriter(new FileWriter("out.txt",true));
            pw.println("Java");
            pw.close();
        } catch (IOException e) {
            System.err.println("Input error Occured");
        }

        /*try {
            FileReader fr = new FileReader("out.txt");
            int ch;

            while((ch=fr.read()) != -1){
                System.err.println((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.err.println("Output error Occured");
        }*/
        
    }
}

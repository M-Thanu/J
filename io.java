import java.io.*;
public class io {
    public static void main(String[] args) {
        try {
            PrintWriter fw = new PrintWriter(new FileWriter("data.txt",true));
            fw.println("File Handling");
            fw.close();
        } catch (IOException e) {
            System.err.println("Input Error");
        }
        
        try {
            BufferedReader fr = new BufferedReader(new FileReader("data.txt"));
            String sen;
            sen=fr.readLine();
            System.err.println(sen);
            fr.close();
        } catch (IOException e) {
            System.err.println("Output Error");
        }
        
    }
}

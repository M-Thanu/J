import java.net.*;

public class network {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Host: "+ ip.getHostName());
        System.out.println("IP Address: "+ ip.getHostAddress());
    }
}

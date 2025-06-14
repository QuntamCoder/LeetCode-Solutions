import java.net.InetAddress;   
public class IpAddress {
    public static void main(String[] args) {
    try{
        InetAddress add=InetAddress.getLocalHost();
         System.out.println(add.getLocalHost());
    }catch(Exception ee){
        ee.getStackTrace();
    }
    }
}

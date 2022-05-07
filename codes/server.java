import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1448);
        Socket s = ss.accept();
        String filename = args[0];
        InputStream i = s.getInputStream();
        int b;
        FileOutputStream fo= new FileOutputStream(filename);
        while((b=i.read())!=-1){
            fo.write(b);
        }
    }    
}

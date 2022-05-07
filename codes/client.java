import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws Exception {
        Socket  s = new Socket("localhost",1448);
        String filename = args[0];
        DataOutputStream d = new DataOutputStream(s.getOutputStream());
        InputStream it = new FileInputStream(new File(filename));
        int b;
        while((b=it.read())!=-1){
            d.write(b);
        }
            
    }
}

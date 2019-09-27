import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

class MyClient {
    public static void main(String args[])throws IOException {
        Socket s=new Socket("localhost",1254);
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        s.close();
        is.close();
        br.close();
    }
}

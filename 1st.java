import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class MyServer {

        public static void main(String args[])throws IOException {
            ServerSocket ss=new ServerSocket(1254);
            Socket s=ss.accept();
            System.out.println("Connection Established!!!");
            OutputStream os=s.getOutputStream();
            PrintStream ps=new PrintStream(os);
            String str="Hello Client";
            ps.println(str);
            ps.println("BYE!!!");
            ss.close();
            s.close();
            ps.close();
        }
    }

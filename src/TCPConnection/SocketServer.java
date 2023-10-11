package TCPConnection;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket socket = ss.accept();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String str = dis.readUTF();
        System.out.print(str);
        socket.close();
    }
}

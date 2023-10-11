package TCPConnection;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("Hello");
        dos.flush();
        dos.close();
        socket.close();
    }
}

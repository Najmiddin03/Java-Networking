package EchoApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String str = input.readLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

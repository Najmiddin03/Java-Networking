import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class read_url {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://github.com/Najmiddin03");
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();
        int i;
        while (true) {
            i = is.read();
            if (i == -1) {
                break;
            }
            System.out.print((char) i);
        }
    }
}

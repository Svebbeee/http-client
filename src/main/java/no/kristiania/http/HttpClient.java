package no.kristiania.http;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class HttpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("httpbin.org", 80);

        socket.getOutputStream().write(
                ("Get /html HTTP/1.1\r\n" +
                        "Host: httpbin.org\r\n" + "\r\n").getBytes()
        );

        InputStream in = socket.getInputStream();
    }
}

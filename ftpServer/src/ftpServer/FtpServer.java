/**
 * The type FtpServer.
 *
 * @author yi.wang11@hand-china.com
 * @version 1.0
 */

package ftpServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FtpServer {

    private int port;

    ServerSocket serverSocket;

    public FtpServer(int port) throws IOException {

        serverSocket = new ServerSocket(port);
        //初始化系统信息
        Share.init();
    }

    public void listen() throws IOException {

        Socket socket = null;
        while(true) {
            //建立ftp连接,三次握手的过程
            socket = serverSocket.accept();
            ControllerThread thread = new ControllerThread(socket);
            thread.start();
            thread.run();
        }
    }

    public static void main(String args[]) throws IOException {
        FtpServer ftpServer = new FtpServer(21);
        ftpServer.listen();
    }

}
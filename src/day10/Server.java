package day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

/**
 * 将聊天室服务端今天写的内容独立完成一次， 完成后，修改代码，使得服务端可以一直读取 客户端发送过来的每一条消息并输出到控制台。
 * 
 * 初始化服务端时，读取当前包中文件的第一行，用该端口进行 ServerSocket的初始化。
 * 
 * @author Xiloer
 *
 */
public class Server {
	private ServerSocket server;

	Server() throws IOException {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("server-config.txt");
			prop.load(fis);
			int port = Integer.parseInt(prop.getProperty("serverPort"));
			server = new ServerSocket(8088);


	}

	public void start() {
		try {
			System.out.println("等待客户端连接..");
			Socket socket = server.accept();
			System.out.println("一个客户端连接了..");
		} catch (Exception e) {
			System.out.println("客户端连接失败");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			System.out.println("服务器端启动失败");
		}
	}
}

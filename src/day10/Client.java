package day10;

import java.io.IOException;
import java.net.Socket;

/**
 * 将聊天室客户端今天写的内容独立完成一次，
 * 完成后，修改代码，使聊天室可以实现用户
 * 随意在控制台输入内容并发送给服务端。
 * 
 * 在构造方法中初始化Socket时，服务端的地址与端口通过读取当前包中的config.txt
 * 文件的两行内容得到，并依读取到的值初始化Socket。
 * @author Xiloer
 *
 */
public class Client {
	private Socket socket;
	Client()throws IOException{
		System.out.println("正在连接服务器");
		socket=new Socket("localHost",8088);
		System.out.println("成功连接到服务器");
	}
	public void start(){
		
	}
	
	
	public static void main(String[] args) {
		try {
			Client client=new Client();
			client.start();
		} catch (Exception e) {
			System.out.println("客户端启动失败");
			e.printStackTrace();
		}
	}
}

package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//方式1，继承Thread
		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你好");
				}
			}
		}.start();
		//方式2.将Runnable的实现类传入Thread参数接收括号
		new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i <1000; i++) {
					System.out.println("再见");
				}
			}
		}).start();		
	}
}

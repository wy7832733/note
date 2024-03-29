package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println("你好");
				}
			}
		}).start();
		
		Thread t=new Thread(new MyRunnable());
	}
}

class MyRunnable implements Runnable{
	public void run(){
		System.out.println("再见");
	}
}

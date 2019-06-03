package day09;

/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * 
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你好");
				}
			}
		}.start();
		
		
		Thread t=new MyThread();
		t.start();

	}

}

class MyThread extends Thread{
	public void run(){
		System.out.println("再见");
	}
}
package day06;

import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Xiloer
 *
 */
public class Test09 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("note.txt","rw");
		Scanner sc=new Scanner(System.in);	
		System.out.println("请输入字符串");
		while(true){
			String input=sc.nextLine();
			if(input.equals("exit")){
				break;
			}
			byte[] bytes=input.getBytes();
			raf.read(bytes);
			raf.write(bytes);
		}	
		raf.close();
	}
}




		/*将键盘输入(打印流，字节流的子类)用字节转字符流对象转为字符流，再转换成缓冲流
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));//
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("note.txt")));
		//BufferedWriter bufw1=new BufferedWriter(new FileWriter("note.txt"));
		String str;
		while((str=bufr.read))*/
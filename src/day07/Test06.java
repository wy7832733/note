package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args)throws Exception {
		noteBook();
	}
	
	
	public static void noteBook()throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名");
		String name=sc.next().trim();
		
		sc.nextLine();
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(new FileOutputStream(name,true)),true);
		System.out.println("请输入要写入文件的字符串");		
		while(true){

			String line=sc.nextLine();

			if(line.equals("exit")) break;
			pw.println(line);				
		}
		pw.close();
	}
	
	
}
    


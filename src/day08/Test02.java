package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		updateNote();
	}
	
	public static void updateNote(){
		Scanner sc=new Scanner(System.in);
		
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(new OutputStreamWriter(new FileOutputStream("note.txt",true),"UTF-8"),true);
			System.out.println("请输入字符串");
			while(true){
				String line=sc.nextLine();
				
				if (line.equals("exit")) {
					break;
				}
				pw.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (pw!=null) {
				try {
					pw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}

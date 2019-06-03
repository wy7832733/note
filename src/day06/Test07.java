package day06;

import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名");
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public void copy1(String name)throws Exception{
		RandomAccessFile raf=new RandomAccessFile(name,"rw");
		int ch;
		while((ch=raf.read())!=-1){
			raf.write(ch);
		}
		raf.close();
		
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public void copy2(String name)throws Exception{
		RandomAccessFile raf=new RandomAccessFile(name,"rw");
		byte[] buf=new byte[1024];
		int length;
		while((length=raf.read(buf))!=-1){
			raf.write(buf,0,length);
		}
		raf.close();
	}
}

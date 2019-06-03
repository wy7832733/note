package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要创建的文件");
		String input=sc.next().trim();
		File file=new File(input);
		createDirs(file);
		
	}
	
	static int count=0;
	public static void createDirs(File file){
		StringBuilder sb=new StringBuilder(file.toString());
		if(file.exists()){
			String regex="[3](_副本\\d)*";
			count++;
			String str="/"+file.getName().replaceAll(regex, "3_副本"+count);
			String input1=sb.append(str).toString();
			File file1=new File(input1);
			if (file1.exists()) {
				createDirs(file1);
			}else{
				file1.mkdirs();
			}
		}else{
			file.mkdir();
		}
	}
}

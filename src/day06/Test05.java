package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入需要删除的文件的文件名");
		String input=sc.next().trim();
		File file=new File(input);
		System.out.println(deleteFile(file));
		
	}
	
	public static boolean deleteFile(File file){
		if(!file.exists()){
			return false;
		}
		if (file.isFile()) {
			return file.delete();
		}else{
			File[] files=file.listFiles();
			for(File file1:files){
				if (file1.isFile()) {
					return file1.delete();
				}else{
					deleteFile(file1);
				}
			}
			return file.delete();
		}
	}
}

package day06;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args){
		File file=new File(".");
		File[] files=file.listFiles();
		for(File file1:files){
			System.out.println(file1);
		}
	}
}

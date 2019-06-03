package day02;

import java.util.Scanner;

/**
 * 实现文件重命名。 要求用户输入一个文件名称，例如:abc.jpg 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * 
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件名称");
		String reg = ".+\\.[a-z]{2,5}";
			String fileName = sc.next().trim();		
		if (fileName.matches(reg)) {
			String regex1 = ".+\\.";
			fileName = fileName.replaceAll(regex1, System.currentTimeMillis() + ".");
			System.out.println(fileName);
		}else{
			System.out.println("您输入的文件格式不对");
		}

	}
}

package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个IP地址");
		String ip = sc.next();
		String regex1 = "\\w+(\\.[a-z]+){1,2}";
		if (ip.matches(regex1)) {
			String regex = "\\.";
			String[] arr = ip.split(regex);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}else {
			System.out.println("您输入的不是域名");
		}

	}
}

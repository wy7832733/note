package day01;

import java.util.Scanner;

/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:

 * 
 * @author Xiloer
 *
 */

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 编写一个回文字符串，然后调用check方法检查
		 * 该字符串是否为回文，然后输出检查结果。
		 * 若是回文则输出:是回文
		 * 否则输出:不是回文
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要要检验的字符串");
		String str=sc.next();
		System.out.println(check(str));
	}
	/**
	 * 判读该方法是否是回文
	 * @param str 需要判断的字符串
	 * @return true表示是回文，false表示不是回文
	 */
	public static boolean check(String str){
		StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString().equals(str);
		
	}
}

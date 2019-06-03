package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的邮箱地址：");
		String email=sc.next();
		System.out.println(getUserName(email));
	}
	public static String getUserName(String str){
		int index=str.indexOf("@");
		String userName=str.substring(0,index);
		return userName;
	}
	
}


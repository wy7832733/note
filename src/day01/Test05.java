package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Xiloer
 *
 */
/**
 *  
 * @author wuyao
 * @date 2017年10月18日下午11:04:50
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String guess=creatString();
		System.out.println(guess);
		System.out.println("请输入验证码：");
		String input=sc.next();
		System.out.println(compare(input,guess));
		
	}
	public static String creatString(){
		String guess="";
		char[] elements={ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < 5; i++) {
			int index=(int)(Math.random()*52);
			guess=guess+elements[index];
		}
		return guess;
	}
	

	/**
	 *  
	 * @author wuyao
	 * @date 2017年10月18日下午10:49:22
	 */
	public static boolean compare(String input,String guess){
		return guess.trim().equalsIgnoreCase(input.trim());
	}
	
}

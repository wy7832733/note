package day03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入生日(yyyy-MM-dd)");
		String input=sc.next().trim();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf.parse(input);
		Date date2=new Date();
		long numOfWeek=(date2.getTime()-date1.getTime())/(1000*60*60*24*7);
		System.out.println(numOfWeek);
	}
}

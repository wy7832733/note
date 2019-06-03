package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Xiloe
 *
 */
public class Test05 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入身份证号");
		String idNum=sc.next().trim();
		if (idNum.matches("\\d{17}[xX\\d]")) {
			String str=idNum.substring(6, 14);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
			Date birthday=sdf.parse(str);
			Calendar cal=Calendar.getInstance();
			cal.setTime(birthday);		
			SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("出生日期："+sdf1.format(cal.getTime()));				
			cal.add(Calendar.YEAR, 20);
			System.out.println("20周岁生日："+sdf1.format(cal.getTime()));
			cal.set(Calendar.DAY_OF_WEEK, 4);
			System.out.println("当周的周三为："+sdf1.format(cal.getTime()));			
		}else{
			System.out.println("输入的身份证格式有误");
		}
	}
}

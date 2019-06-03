package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入生产日期(yyyy-MM-dd)和保质期天数");
		String input=sc.next().trim();
		int num=sc.nextInt();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(input);//获取输入的时间的date对象
		Calendar c=Calendar.getInstance();
		c.setTime(date);//把这个日期传给Calendar对象
		c.add(Calendar.DAY_OF_YEAR, num);//算出过期时间
		c.add(Calendar.WEEK_OF_MONTH, -2);//往前移两周
		c.set(Calendar.DAY_OF_WEEK,4);//时间设为周三
		System.out.println(sdf.format(c.getTime()));
	}
}

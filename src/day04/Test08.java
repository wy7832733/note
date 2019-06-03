package day04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Xiloer
 *
 */
public class Test08 {
	public static void main(String[] args)throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个日期(yyyy-MM-dd格式)");
		String str1=sc.next().trim();
		String str2=sc.next().trim();
		String str3=sc.next().trim();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf.parse(str1);
		Date date2=sdf.parse(str2);
		Date date3=sdf.parse(str3);
		Set<Date> ts=new TreeSet<Date>();//如果对象本身具有比较性(实现了Comparable并重写了compareTo)，
		ts.add(date1);//TreeSet会按compare功能来排序
		ts.add(date2);
		ts.add(date3);
		for(Date d:ts){
			System.out.println(sdf.format(d));
		}
		List<Date> list=new ArrayList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		Collections.sort(list);
		for(Date date:list){
			System.out.println(sdf.format(date));
		}
	}
	
}

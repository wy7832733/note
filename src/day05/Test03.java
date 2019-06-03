package day05;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工信息：");
		String info=sc.next().trim();
		String[] arr=info.split("[,;]");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		List<Emp> emps=new ArrayList<Emp>();
		for (int i = 0; i < arr.length; i+=5) {
			String name=arr[i];
			int age=Integer.parseInt(arr[i+1]);
			String gender=arr[i+2];
			double salary=Double.parseDouble(arr[i+3]);
			Date hiredate=sdf.parse(arr[i+4]);
			Emp emp=new Emp(name,age,gender,salary,hiredate);
			emps.add(emp);
		}
		//Collections.sort(emps);
		//由于元素自身的compareTo功能并不是我们想要的，所以自定义了一个比较器
		Collections.sort(emps,new MyComparator());//参数为要排序的集合和一个自定义的比较器对象
		for(Emp emp:emps){
			System.out.println(emp);
		}

	}
}

class MyComparator implements Comparator<Emp>{//注意定义集合  实现Comparable 定义迭代器  自定义比较器实现比较器  都需要加上泛型
	public int compare(Emp e1,Emp e2){
		return e1.getDate().compareTo(e2.getDate());
	}
}

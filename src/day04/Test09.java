package day04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Xiloer
 *
 */
public class Test09 {
	public static void main(String[] args) throws Exception{
		List<Emp2> list=new ArrayList<Emp2>();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工信息(格式：张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...)");
		String[] arr=sc.next().trim().split("[;]");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");		
		for (int i = 0; i < arr.length; i++) {
			String[] info=arr[i].split(",");
			String name=info[0];
			int age=Integer.parseInt(info[1]);
			String gender=info[2];
			double salary=Double.parseDouble(info[3]);
			Date hiredate=sdf.parse(info[4]);
			list.add(new Emp2(name,age,gender,salary,hiredate));			
		}
		for(Emp2 e:list){//增强for
			System.out.println(e);
		}
		Iterator<Emp2> it=list.iterator();
		while(it.hasNext()){//迭代器
			Emp2 emp=it.next();
			Calendar cal=Calendar.getInstance();
			cal.setTime(emp.getDate());
			cal.add(Calendar.MONTH, 3);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
			System.out.println("转正日期"+sdf.format(cal.getTime()));
		}
	}
}

class Emp2{
	private String name;
	private int age;
	private String gender;
	private double salary;
	private Date hiredate;
	Emp2(String name,int age,String gender,double salary,Date hiredate){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.hiredate=hiredate;
	}
	public String toString(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return "姓名："+name+" 年龄"+age+" 性别"+gender+" 工资"+salary+" 入职日期"+sdf.format(hiredate);
	}
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(obj==this) return true;
		if (obj instanceof Emp2) {
			Emp2 one=(Emp2)obj;//因为是在本类中，所以任意本类对象可以访问本类的私有成员。
			return this.name.equals(one.name) && this.age==one.age && this.hiredate.equals(one.hiredate);
		}else{
			return false;
		}
	}
	public Date getDate(){//入职日期私有化，所以提供了一个获取入职日期的公开方法
		return this.hiredate;
	}
}

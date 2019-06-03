package day03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Xiloer
 *
 */

public class Test07 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工数量");
		int count=sc.nextInt();
		List<Emp1> list=new ArrayList<Emp1>();
		System.out.println("请输入员工信息( 张三,25,男,5000,2006-02-15)");
		boolean flag=true;
		int i=0;
		while (flag) {
			String info=sc.next().trim();
			String[] arr=info.split(",");
			String name=arr[0];
			int age=Integer.parseInt(arr[1]);
			String gender=arr[2];
			double salary=Double.parseDouble(arr[3]);
			SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
			Date hiredate=fmt.parse(arr[4]);
			Emp1 emp=new Emp1(name,age,gender,salary,hiredate);
			if (list.contains(emp)) {			
				System.out.println("该用户已存在");
			}else{
				list.add(emp);
				i++;
			}	
			if (i==count) {
				flag=false;
			}
		}
		Iterator<Emp1> it=list.iterator();
		while (it.hasNext()) {
			Emp1 emp=it.next();
			System.out.println(emp);			
		}
	}
}

class Emp1{
	private String name;
	private int age;
	private String gender;
	private double salary;
	private Date hiredate;
	Emp1(String name, int age, String gender, double salary,Date hiredate){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.hiredate=hiredate;
	}
	
	public String toString(){
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		return "姓名："+name+" 年龄"+age+" 性别"+gender+" 工资"+salary+" 入职日期"+fmt.format(hiredate);
	}
	
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(obj==this) return true;
		if (obj instanceof Emp1) {
			Emp1 one=(Emp1)obj;
			return this.name.equals(one.name) && this.age==one.age;
		}else{
			return false;
		}
	}
}








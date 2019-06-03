package day06;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字相同，则认为内容一致。
 * @author Xiloer
 *
 */
public class Emp {
	String name;
	int age;
	String gender;
	int salary;
	Date hiredate;
	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public String toString(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return name+","+age+","+gender+","+salary+","+sdf.format(hiredate);
	}	
	
}

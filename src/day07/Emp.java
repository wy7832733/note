package day07;

import java.io.Serializable;
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
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字，年龄，性别，薪资都相同，则认为内容一致。
 * 实现序列化接口，并定义版本号。
 * @author Xiloer
 *
 */
public class Emp implements Serializable{
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return "姓名：" + name + ", 年龄：" + age + ", 性别：" + gender + ", 薪水" + salary + ", 入职日期："
				+ sdf.format(hiredate) ;
	}
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(obj==this) return true;
		if (obj instanceof Emp) {
			Emp one=(Emp)obj;
			return one.age==this.age && one.gender.equals(this.gender) && one.name.equals(this.name) && one.salary==this.salary;
		}else{
			return false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	
}









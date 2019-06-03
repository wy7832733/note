package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定义私有属性:
 * int id;
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 
 * 定义toString方法，格式如:
 *    id:1,姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求id相同，则认为内容一致。
 * @author Xiloer
 *
 */
public class Emp {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;
	public Emp(int id, String name, int age, String gender, int salary, Date hiredate) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public boolean equals(Object obj){
		if (obj==this) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (obj instanceof Emp) {
			Emp other=(Emp)obj;
			return this.id==other.id;
		}else{
			return false;
		}
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return "id:" + id + ", name:" + name + ", age:" + age + ", gender:" + gender + ", salary:" + salary
				+ ", hiredate:" + sdf.format(hiredate) ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

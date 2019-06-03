package day05;

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
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
 * @author Xiloer
 *
 */
public class Emp implements Comparable<Emp>{
	
	private String name;
	private int age;
	private String gender;
	private double salary;
	private Date hiredate;
	Emp(String name,int age,String gender,double salary,Date hiredate){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.hiredate=hiredate;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	public void setSalart(double salary){
		this.salary=salary;
	}
	public double salary(){
		return salary;
	}	
	public void setDate(Date hiredate){
		this.hiredate=hiredate;
	}
	public Date getDate(){
		return hiredate;
	}	
	public String toString(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return "姓名："+name+",年龄："+age+",性别："+gender+",薪资："+salary+"，入职时间："+sdf.format(hiredate);
	}
	
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(obj==this) return true;
		if (obj instanceof Emp) {
			Emp other=(Emp)obj;
			return this.name.equals(other.name) && this.age==other.age;
		}else{
			return false;		
		}
	}
	
	public int compareTo(Emp e){
		return new Integer(age).compareTo(new Integer(e.age));
		//return this.hiredate.compareTo(e.hiredate);
	}
	
}






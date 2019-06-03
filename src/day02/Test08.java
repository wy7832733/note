package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Xiloer
 *
 */
public class Test08 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		System.out.println("请输入员工信息，格式为 ：张三,25,男,5000;李四,26,女,6000;...");
		Person001[] clerks={new Person001("张三",25,"男",5000),new Person001("李四",22,"男",3000),new Person001("王二",23,"女",5000)};
		System.out.println("公司的员工有：");
		for (int i = 0; i < clerks.length; i++) {
			System.out.println(clerks[i]);
		}
	}

	
}

class Person001{
	private String name;
	private int age;
	private String gender;
	private double salary;
	Person001(String name,int age,String gender,double salary){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}
	public String toString(){
		return name+","+age+","+gender+","+salary;
	}
}

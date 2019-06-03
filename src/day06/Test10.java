package day06;

import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Xiloer
 *
 */
public class Test10 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工信息");
		empInfo(sc);
	}
	static Emp1 e1;
	public static void empInfo(Scanner sc)throws Exception{

		String input=sc.nextLine().trim();
		e1=getEmp1Instance(input);
		byte[] bytes=e1.toString().getBytes();
		RandomAccessFile raf=new RandomAccessFile(e1.name+".emp","rw");
		raf.write(bytes);
		
	}
	public static Emp1 getEmp1Instance(String input)throws Exception{
		String[] info=input.split(",");
		String name=info[0];
		int age=Integer.parseInt(info[1]);
		String gender=info[2];
		double salary=Double.parseDouble(info[3]);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date hiredate=sdf.parse(info[4]);
		return new Emp1(name,age,gender,salary,hiredate);
	}
	
}

class Emp1{
	String name;
	int age;
	String gender;
	double salary;
	Date hiredate;
	public Emp1(String name, int age, String gender, double salary, Date hiredate) {
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






package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工人数(>=5)");
		int count=sc.nextInt();
		
		
		for (int i = 0; i <= count; i++) {		
			Emp emp=getEmpInstance();
			ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(emp.getName()+".obj")));
			oos.writeObject(emp);
		}
	}
	public static Emp getEmpInstance()throws Exception{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] info=input.split(",");
		String name=info[0];
		int age=Integer.parseInt(info[1]);
		String gender=info[2];
		int salary=Integer.parseInt(info[3]);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date hiredate=sdf.parse(info[4]);
		return new Emp(name,age,gender,salary,hiredate);
	}
	
}

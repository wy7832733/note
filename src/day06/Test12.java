package day06;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Xiloer
 *
 */
public class Test12 {
	static Emp1 e1;	
	public static void main(String[] args) throws Exception {
		Map<String,Emp1> map=getMap();
		checkEmp(map);
	}

	//定义一个查找员工的功能，集合在参数内括号内也要加上泛型
	public static void checkEmp(Map<String,Emp1> map){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工姓名");
		String name=sc.next().trim();
		if (map.containsKey(name)) {
			Calendar cal=Calendar.getInstance();
			Emp1 e=map.get(name);
			cal.setTime(e.hiredate);
			cal.add(Calendar.YEAR, 20);
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(e.name+","+e.age+","+e.salary+","+sdf.format(cal.getTime()));
		}else{
			System.out.println("查无此人");
		}
	}
	
	
	//定义一个将当前目录下的emp文件解析成Emp1对象，并存入到一个hashmap集合的功能
	public static Map getMap() throws Exception{
		FileFilter ff=new FileFilter(){
			public boolean accept(File file){
				return file.getName().endsWith(".emp");
			}
		};
		File file=new File(".");
		File[] files=file.listFiles(ff);
		Map<String,Emp1> map=new HashMap<String,Emp1>();
		byte[] buf=new 	byte[1024];
		int length;
		for (int i = 0; i < files.length; i++) {
			//练习采用文件字节读取流读取文件
			FileInputStream fis=new FileInputStream(files[i]);
			String empInfo="";
			while((length=fis.read(buf))!=-1){
				empInfo+=new String(buf,0,length);
			
			}
			e1=Test10.getEmp1Instance(empInfo);
			map.put(e1.name, e1);				
		}
		return map;
	}
}

package day06;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后输出该集合中每个员工信息。
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为int,长度为4个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为字符串，格式"yyyy-MM-dd"，长度为30个字节，编码为:UTF-8
 * 格式可参考当前包中emp.jpg图
 * 提示:
 * 使用RandomAccessFile读取字符串时，例如name,可以先读取32个字节，再按照UTF-8
 * 转换为字符串，读取age时可以直接使用readInt方法。依次类推。
 * @author Xiloer
 *
 */
public class Test13 {
	public static void main(String[] args) throws URISyntaxException, IOException ,Exception {
		//使用类加载器加载当前包中的emp.dat文件
		File file = new File(Test13.class.getClassLoader().getResource("day06/emp.dat").toURI());
		RandomAccessFile raf=new RandomAccessFile(file,"r");
		List<Emp> list=new ArrayList<Emp>();
		for (int i = 1; i < 11; i++) {
			list.add(empInfo(raf,i));
		}
		//练习用迭代器取出集合中的每个元素
		Iterator<Emp> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
	public static Emp empInfo(RandomAccessFile raf,int n)throws Exception{
		int start=(n-1)*80;
		raf.seek(start);		
		byte[] bytes=new byte[32];
		raf.read(bytes);
		String name=new String(bytes,"UTF-8").trim();
		int age=raf.readInt();
		bytes=new byte[10];
		raf.read(bytes);
		String gender=new String(bytes,"UTF-8").trim();
		int salary=raf.readInt();
		bytes=new byte[30];
		raf.read(bytes);
		String hiredate1=new String(bytes,"UTF-8").trim();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date hiredate=sdf.parse(hiredate1);
		return new Emp(name,age,gender,salary,hiredate);		
	}
}

package day06;

import java.io.File;
import java.io.FileFilter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Xiloer
 *
 */
public class Test11 {
	public static void main(String[] args) throws Exception {
		File file=new File(".");
		FileFilter ff=new FileFilter(){//通过建立匿名内部类的方式建立FileFilter的一个实现类
			public boolean accept(File file){
				return file.getName().endsWith(".emp");
			}
		};
		File[] files=file.listFiles(ff);//调用listFiles,参数传入FileFilter的一个实现类对象删选出符合要求的文件
		List<Emp1> emps=new ArrayList<Emp1>();		
		for (int i = 0; i < files.length; i++) {
			RandomAccessFile raf=new RandomAccessFile(files[i],"r");
			byte[] bytes=new byte[(int)raf.length()];
			raf.read(bytes);
			String input=new String(bytes);
			emps.add(Test10.getEmp1Instance(input));//调用本包类的一个将字符串转化成Emp1对象的静态方法
		}
		Collections.sort(emps,new empComparator());
		for(Emp1 e1:emps){
			System.out.println(e1);
		}
	}
}

class empComparator implements Comparator<Emp1>{//自定义一个根据年龄来比较的比较器
	public int compare(Emp1 e1,Emp1 e2){
		return new Integer(e1.age).compareTo(new Integer(e2.age));
	}
}



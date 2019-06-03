package day07;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * 
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args)throws Exception {
		File file = new File(".");
		FileFilter ff = new FileFilter() {
			public boolean accept(File file) {
				return file.getName().endsWith(".obj");
			}
		};

		List<Emp> emps = new ArrayList<Emp>();
		File[] files = file.listFiles(ff);
		for (int i = 0; i < files.length; i++) {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(files[i])));
			emps.add((Emp)ois.readObject());
		}
		Collections.sort(emps,new EmpComparator());
		for(Emp emp:emps){
			System.out.println(emp);
		}

	}

}

	
	class EmpComparator implements Comparator<Emp>{
		public int compare(Emp e2,Emp e1){
			return new Integer(e1.getSalary()).compareTo(new Integer(e2.getSalary()));
		}
	}


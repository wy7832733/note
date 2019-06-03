package day06;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args)throws Exception{
		File file=new File("myfile.txt");
		file.createNewFile();
		System.out.println(file.getName());
		System.out.println(file.length());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(file.lastModified()));
	}
}

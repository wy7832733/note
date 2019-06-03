package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("myfile.txt");
		FileOutputStream fos=new FileOutputStream("myfile_cp.txt");
		int length;
		byte[] buf=new byte[1024];
		while((length=fis.read(buf))!=-1){
			fos.write(buf,0,length);
		}
		
	}
}

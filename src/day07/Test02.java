package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * 
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) throws Exception {
		BufferedReader bufr;
		PrintWriter out;
		File file1 = new File("myfile.txt");
		File file2 = new File("myfile_cp2.txt");
		bufr = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(file1)), "UTF-8"));
		out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(file2)), "UTF-8"),
				true);
		String line;
		while ((line = bufr.readLine()) != null) {
			out.println(line);
		}
		bufr.close();
		out.close();
	}
}

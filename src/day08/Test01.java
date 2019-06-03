package day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获 机制对流的异常进行捕获和处理，finally中 要将流关闭
 * 
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		BufferedReader bufr=null;
		PrintWriter pw=null;
		try{
			bufr=new BufferedReader(new FileReader("myfile.txt"));
			pw=new PrintWriter(new FileWriter("myfile.txt_1"),true);			
			String line;
			
			while((line=bufr.readLine())!=null){
				pw.println(line);
			}

		
		}catch(IOException e){
			System.out.println("");
			e.printStackTrace();
		}finally{
			if (bufr!=null) {
				try{
					bufr.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			if (pw!=null) {
				try{
					pw.close();
				}catch(Exception t){
					t.printStackTrace();
				}
			}			
			
		}
	}

}

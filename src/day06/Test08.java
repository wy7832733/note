package day06;

import java.io.RandomAccessFile;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Xiloer
 *
 */
public class Test08 {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("test8","rw");
		raf.writeInt(Integer.MAX_VALUE);
		raf.writeLong(Long.MAX_VALUE);
		raf.seek(0);
		System.out.println(raf.readInt());
		System.out.println(raf.getFilePointer());
		System.out.println(raf.readLong());
		System.out.println(raf.getFilePointer());		
	}
}

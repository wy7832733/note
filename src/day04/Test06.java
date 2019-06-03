package day04;


import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args){
		String[] arr={"one","two","three"};
		List al=Arrays.asList(arr);//数组转集合得到的既不是 ArrayList也不是LinkedList
	}
}

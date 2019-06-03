package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("$");		
		list.add("2");		
		list.add("$");		
		list.add("3");		
		list.add("$");		
		list.add("4");	
		list.remove("$");
		for(String elements:list ){
			System.err.println(elements);
		}
	}

}

package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int n=(int)(Math.random()*1000);
			list.add(n);
		}
		Integer[] arr=new Integer[list.size()];
		arr=list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		List<Integer> list1=Arrays.asList(arr);
		list=list1;
		System.out.println(list);
	}
}

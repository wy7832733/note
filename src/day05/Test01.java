package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args){
		Queue<Integer> list=new LinkedList<Integer>();
		list.offer(1);	//在最后加上一个元素	
		list.offer(2);		
		list.offer(3);		
		list.offer(4);		
		list.offer(5);	
//		for(Integer i:list){
//			System.out.println(i);			
//		}
		System.out.println();
		while(list.size()>0){
			System.out.println(list.poll());//list.poll()从头删除一个元素，并返回该元素，如果没有返回null
			//list.poll()从头取一个元素，不删除，返回该元素
		}
	}

}


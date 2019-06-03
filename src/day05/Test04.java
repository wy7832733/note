package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Xiloer
 *
 */
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		Map<String, Integer> grades = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		String data = sc.next().trim();
		String[] arr = data.split("[:;]");
		for (int i = 0; i < arr.length; i += 2) {
			String subject = arr[i];
			int grade = Integer.parseInt(arr[i + 1]);
			grades.put(subject, grade);
		}
		System.out.println(grades);
		System.out.println(grades.get("物理"));
		grades.put("化学",96);
		grades.remove("英语");
		
		Set<String> set=grades.keySet();
		//采用foreach循环遍历
		for(String subject:set){
			System.out.println(subject+":"+grades.get(subject));
		}
		//采用迭代器遍历
		Set<Map.Entry<String,Integer>> entrySet=grades.entrySet();//先得到entrySet集合	
		Iterator<Map.Entry<String,Integer>> it=entrySet.iterator();//获取迭代器
		while(it.hasNext()){
			Map.Entry<String, Integer> es=it.next();
			System.out.println(es.getKey()+":"+es.getValue());
		}
		
		//抄答案。。调用map.values();可以获取一个集合
		Collection<Integer> value=grades.values();//次功能用于获得Map里的所有值
		for(Integer grade: value){
			System.out.println(grade);
		}
		
		

	}
}

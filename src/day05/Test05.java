package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String info=sc.next().trim();
		Map<String,Integer> map=new HashMap<String,Integer>();
		String[] arr=info.split("[:;]");
		for (int i = 0; i < arr.length; i+=2) {
			Integer value=map.get(arr[i]);
			if(value!=null){
				map.put(arr[i], value+1);
			}else{
				map.put(arr[i],1);
			}
		}
		Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
		for(Map.Entry<String,Integer> me:entrySet){
			System.out.println("职位："+me.getKey()+"，人数:"+me.getValue());
		}
	}
}

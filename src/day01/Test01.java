package day01;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Xiloer
 *
 */

import java.util.Arrays;
import java.util.UUID;

/**
 * @package day0111212
 * asadfadsfasdf
bbbbbbb水电费嘎嘣
 * @author wuyao
 * @date 2017年10月18日下午10:13:53
 * 
 */
/**
 * @author wuyao
 * @date 2017年10月18日下午10:22:17
 * @description TODO
 */
/**
 * @author wuyao
 * @date 2017年10月18日下午10:24:30
 * @description 
 */
/**
 *  
 * @author wuyao
 * @date 2017年10月18日下午10:59:22
 */
public class Test01 {
	public static void main(String[] args) {

		
	    String[] arr=",,,,".split(",");
		//以下自行调用test2,test3...等方法。
	    System.out.println(Arrays.toString(arr));
	}
	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */
	public static void test1(String str){
		System.out.println(str.length());
	}
	/**
	 * @description 
	 * @param @param str
	 * @return void
	 * @author wuyao
	 * @date 2017年10月18日下午10:29:35
	 */
	public static void test2(String str){
		System.out.println(str.indexOf("o"));
	}
	
	/**
	 * 这是一个用来撒地方撒旦法师法师都干撒的gas大噶是个撒个·阿斯达干啥噶十多个
	 * 啥地方撒旦噶十多个
	 * @param str
	 * @return void
	 * @author wuyao
	 * @date 2017年10月18日下午10:34:33
	 */
	public static void test3(String str){
		System.out.println(str.indexOf("o",5));
	}
	public static void test4(String str){
		System.out.println(str.substring(0,5));
	}
	public static void test5(String str){
		System.out.println(str.substring(5));
	}	
	public static void test6(String str){
		System.out.println(str.trim());
	}	
	public static void test7(String str){
		System.out.println(str.charAt(5));
	}	

	public static void test8(String str){
		System.out.println(str.startsWith("h"));
		System.out.println(str.endsWith("ld"));
	}	
	public static void test9(String str){
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}	

	
}

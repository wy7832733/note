package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("大家好!");
		sb.append("我是程序员");
		System.out.println(sb.toString());	
		sb.insert(6, "优秀的");
		System.out.println(sb.toString());
		sb.replace(6,9,"牛牛的");//替代功能   起始，结束(不包含尾)，新字符串
		System.out.println(sb.toString());
		sb.delete(0, 4);
		System.out.println(sb.toString());		
	}
}

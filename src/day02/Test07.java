package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数学计算表达式");
		String str=sc.next().trim();
		if (str.indexOf("+")!=-1) {
			Double a=Double.parseDouble(str.split("\\+")[0]);
			Double b=Double.parseDouble(str.split("\\+")[1]);
			
			System.out.println(str+"="+getResult(a+b));
		}else if (str.indexOf("-")!=-1) {
			Double a=Double.parseDouble(str.split("-")[0]);
			Double b=Double.parseDouble(str.split("-")[1]);
			System.out.println(str+"="+getResult(a-b));			
		}else if (str.indexOf("*")!=-1) {
			Double a=Double.parseDouble(str.split("\\*")[0]);
			Double b=Double.parseDouble(str.split("\\*")[1]);	
			System.out.println(str+"="+getResult(a*b));				
		}else if (str.indexOf("/")!=-1) {
			Double a=Double.parseDouble(str.split("/")[0]);
			Double b=Double.parseDouble(str.split("/")[1]);	
			System.out.println(str+"="+getResult(a/b));			
		}else{
			System.out.println("您输入的数学计算式不正确");
		}
	}
	
	public static Object getResult(double d){
		String str=String.valueOf(d);
		String regex="\\d+\\.0";
		if (str.matches(regex)) {
			return (int)d;
		}else{
			return d;
		}
	}
}

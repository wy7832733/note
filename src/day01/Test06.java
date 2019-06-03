package day01;
/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Xiloer
 *
 */
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个两个元素的计算表达式");
		String input=sc.next();
		getAnswer(input);
	}
	
	
	public static int parseInt(String str){//提供了一个字符串转数字的方法
		//最后要生成的数字
		int num = 0;
		//临时变量，用于计算对应位数的数字
		int flag = 0;
		for(int i=0;i<str.length();i++){
			flag = (str.charAt(i)-48);
			/*
			 * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
			 * 得到
			 * 可以用Math的相关方法处理(自行查看API文档)
			 */
			for(int n=0;n<str.length()-1-i;n++){
				flag*=10;
			}
			num+=flag;
		}
		return num;
	}
	public static void getAnswer(String input){
		int[] arr;
		for (int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)){
			case '+':
				arr=getTwoNum(input,i);
				System.out.println(input+"="+(arr[0]+arr[1]));
				break;
			case '-':
				arr=getTwoNum(input,i);
				System.out.println(input+"="+(arr[0]-arr[1]));
				break;
			case '*':
				arr=getTwoNum(input,i);
				System.out.println(input+"="+(arr[0]*arr[1]));
				break;
			case '/':
				arr=getTwoNum(input,i);
				System.out.println(input+"="+(arr[0]/arr[1]));
				break;	
			}
		}
	}
	public static int[] getTwoNum(String input,int i){
		int[] arr=new int[2];		
		String str1=input.substring(0,i);
		String str2=input.substring(i+1);
		arr[0]=parseInt(str1);
		arr[1]=parseInt(str2);
		return arr;
	}
}









package day03;
/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Xiloer
 *
 */
import java.util.Date;
public class Test01 {
	public static void main(String[] args){
		Date date=new Date();
		long time=date.getTime();
		System.out.println(date);
		System.out.println(time);
		time+=1000*60*60*24*3;
		date.setTime(time);
		System.out.println(date);
		
		
	}
}

package day02;
/**
 * 将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args){
		String str="123abc456def789ghi";
		String regex="[a-z]+";
		String str1=str.replaceAll(regex, "#char#");
		System.out.println(str1);
		
	}
}

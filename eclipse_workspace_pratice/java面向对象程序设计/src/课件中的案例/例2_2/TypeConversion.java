package 课件中的案例.例2_2;
/**
 * 类型转换练习
 * @author 卢泽华
 *
 */
public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b+1);
		char ch = 'a';
		int x = ch;
		System.out.println(++x);
		ch = (char)x;
		System.out.println(ch);
		
		long i = 100;
		System.out.println(i);
		float f = i+3.14f;
		System.out.println(f);
		double d = f;
		System.out.println(d);
	}
}

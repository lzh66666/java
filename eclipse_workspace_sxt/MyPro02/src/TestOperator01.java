/**
 * 测试算术运算符
 * @author 卢泽华
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
		byte a=1;
		int b=2;
		long b2=3;
//		byte c=a+b;//报错
//		int c2=b2+b;//报错
		
		float f1=3.14f;
		double d=b+b2;
//		float d2=f1+6.2;//报错
		System.out.println(-9%5);//取模规则，与左边符号相同
		
		//测试自增和自减
		int m=3;
		int n=m++;
		System.out.println("m="+m+"\nn="+n);
		m=3;
		n=++m;
		System.out.println("m="+m+"\nn="+n);
		//赋值扩算运算符
		
	}
}

import java.math.*;
/**
 * 测试基本数据类型(浮点型)
 * @author 卢泽华
 *
 */
public class TestPrimitiveDateType2 {
	
	public static void main(String[] args) {
		float a=3.14F;
		double b=6.28;
		double c=628E-2;
		System.out.println(c);
		
		//浮点数是不精确的，一定不要用于比较
		float f=0.1f;
		double d=1.0/10;
		System.out.println(f==d);//结果为flase
		
		float d1=423432423f;
		float d2=d1+1;
		if(d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println(d1!=d2);
		}
		System.out.println("#################");
		//使用精确的浮点类型用BigDecimal
		BigDecimal bd=BigDecimal.valueOf(1.0);
		bd=bd.subtract(BigDecimal.valueOf(0.1));
		bd=bd.subtract(BigDecimal.valueOf(0.1));
		bd=bd.subtract(BigDecimal.valueOf(0.1));
		bd=bd.subtract(BigDecimal.valueOf(0.1));
		bd=bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
		
		BigDecimal bd2=BigDecimal.valueOf(0.1);
		BigDecimal bd3=BigDecimal.valueOf(1.0/10);
		
		System.out.println(bd2.equals(bd3));
		
	}
}

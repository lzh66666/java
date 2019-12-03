package 课本上的案例.例2_2;
/**
 * 比较运算符实例
 * @author 路泽华
 *
 */
public class Operators {
	public static void main(String[] args) {
		short aa = 10,cc = 23;
		boolean bb = aa>cc;
		System.out.println("aa>cc?"+bb);
		
		String st1 = new String("how are you");
		String st2 = new String("how are you");
//		比较st1和st2是否为同一对象的引用
		if(st1 == st2) {
			System.out.println("st1==st2 ?"+true);
		}
		else {
			System.out.println("st1==st2 ?"+false);
		}
	}
}

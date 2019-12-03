package 课本上的案例.例2_3;
/**
 * 布尔运算实例
 * @author 卢泽华
 *
 */
public class Operators {
	public static void main(String[] args) {
		int val;
		val = Integer.parseInt(args[0]);
		if(val != 0 && 1.0/val < Double.MAX_VALUE) {
			System.out.println("val的倒数为:"+1.0/val);
		}
		else {
			System.out.println("val的倒数为无穷大");
		}
	}
}

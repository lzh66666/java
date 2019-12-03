package 课本上的案例.例2_7;
/**
 * 计算10以内的整数的和
 * @author 卢泽华
 *
 */
public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}
}

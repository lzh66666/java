package 课件中的案例.例2_8;
/**
 * 计算10以内所有奇数的和
 * @author Administrator
 *
 */
public class TestContinue {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if(i%2 == 0)
				continue;
		    sum += i;
		}
		System.out.println("sum="+sum);
	}
}

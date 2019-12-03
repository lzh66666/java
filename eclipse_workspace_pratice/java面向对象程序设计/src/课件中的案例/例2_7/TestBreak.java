package 课件中的案例.例2_7;
/**
 * 输出50以内所有的素数
 * @author 卢泽华
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int i,j;
		for (j = 2; j <= 50; j++) {
			for(i = 2; i <= j/2; i++) {
				if(j%i == 0) {
					break;
				}
			}
			if(i > j/2) {
				System.out.println(j+"是素数!");
			}
		}
	}
}

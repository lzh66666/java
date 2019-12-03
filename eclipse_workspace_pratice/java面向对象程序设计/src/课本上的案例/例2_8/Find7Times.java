package 课本上的案例.例2_8;
/**
 * 打印100以内7的倍数
 * @author 卢泽华
 *
 */
public class Find7Times {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i%7 == 0) {
				System.out.print(i+" ");
			}
			else {
				continue;
			}
		}
	}
}

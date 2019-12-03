package 课件中的案例.例2_5;

import java.util.Scanner;

/**
 * 根据每个季节输出合适的语句
 * @author 卢泽华
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		String season;
		System.out.println("请从键盘接受一个季节名(英文)");
		Scanner sc = new Scanner(System.in);
		season = sc.next();
		switch(season) {
			case "spring":
				System.out.println("播种的季节!");
				break;
			case "summer":
				System.out.println("繁花似锦的季节!");
				break;
			case "autumn":
				System.out.println("收货的季节!");
				break;
			case "winter":
				System.out.println("白雪皑皑的季节!");
				break;
			default:
				System.out.println("你确定输入的是季节么?");
		}
	}
}

package 课本上的案例.例4_1;
/**
 * 创建7个元素的数组处理一周温度
 * @author 卢泽华
 *
 */
public class ArraryOne {
	public static void main(String[] args) {
		int[] temperature;
		temperature = new int[7];
		for (int i = 0; i < temperature.length; i++) {
			temperature[i] = i;
			System.out.print(temperature[i]+" ");
		}
		System.out.println();
	}
}

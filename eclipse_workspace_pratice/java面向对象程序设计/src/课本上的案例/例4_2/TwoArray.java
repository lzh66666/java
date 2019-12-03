package 课本上的案例.例4_2;
/**
 * 数组名的使用
 * @author 卢泽华
 *
 */
public class TwoArray {
	public static void main(String[] args) {
		int[] arrayOne = new int[8];
		int[] arrayTwo = new int[8];
		System.out.print("arrayOne:");
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = 100;
			System.out.print(" "+arrayOne[i]);
		}
		System.out.print("\narrayTwo:");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(" "+arrayTwo[i]);
		}
		System.out.println("\n*************************");
		arrayTwo = arrayOne;
		arrayTwo[2] = 456;
		System.out.print("arrayOne:");
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print(" "+arrayOne[i]);
		}
		System.out.print("\narrayTwo:");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(" "+arrayTwo[i]);
		}
		System.out.println();
	}
}

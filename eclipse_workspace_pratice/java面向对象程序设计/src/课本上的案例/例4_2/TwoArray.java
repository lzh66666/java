package �α��ϵİ���.��4_2;
/**
 * ��������ʹ��
 * @author ¬��
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

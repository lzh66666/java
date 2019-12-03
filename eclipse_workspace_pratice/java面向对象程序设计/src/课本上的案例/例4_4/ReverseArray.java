package 课本上的案例.例4_4;
/**
 * 数组倒叙方法
 * @author 卢泽华
 *
 */
public class ReverseArray {
	static int[] Reverse(int[] data) {
		int dataLen = data.length;
		int[] dataOut = new int[dataLen];
		int j = dataLen-1;
		for (int i = 0; i < dataOut.length; i++) {
			dataOut[j] = data[i];
			j--;
		}
		return dataOut;
	}
	public static void main(String[] args) {
		int[] a = {10,30,38,96,87,24};
		int[] b = new int[6];
		b = Reverse(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}

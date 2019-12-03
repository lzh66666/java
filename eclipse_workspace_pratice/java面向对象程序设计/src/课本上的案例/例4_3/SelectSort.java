package 课本上的案例.例4_3;
/**
 * 用方法实现数组内数据的排序
 * @author 卢泽华
 *
 */
public class SelectSort {
	static void SortArray(int[] data) {
		int k,temp;
//		循环变量i代表每趟排序时的待排序位置
		for (int i = 0; i < data.length; i++) {
			k = i;
//			k为"当前最小元素"下标,每趟排序开始时先假定待排序位置元素"最小"
			for (int j = i+1; j < data.length; j++) {
//				找到更小的元素时,k保持为"最小元素"下标
				if(data[j] < data[k]) {
					k = j;
				}
			}
			temp = data[i];
			data[i] = data[k];
			data[k] = temp;
		}
	}
	public static void main(String[] args) {
		int[] ia = {69,99,78,35,98,28,87};
		SortArray(ia);
		for (int i = 0; i < ia.length; i++) {
			System.out.print(ia[i]+" ");
		}
	}
}

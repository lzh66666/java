package cn.sxt.arrays;
/**
 * 测试数组的遍历
 * @author 卢泽华
 *
 */
public class Test03 {
	public static void main(String[] args) {
		int[] a=new int[4];
//		初始化数组元素的值
		for (int i = 0; i < a.length; i++) {
			a[i]=10*i;
		}
//		读取元素的值
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("##########");
//		foreach循环，用于读取数组元素的值，不能用于修改
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("##########");
		
		String[] str= {"ss","132","dsfa"};
		for (String string : str) {
			System.out.println(string);
		}
	}
}

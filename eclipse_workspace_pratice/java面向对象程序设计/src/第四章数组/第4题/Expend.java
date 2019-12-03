package 第四章数组.第4题;

import java.util.Arrays;

public class Expend {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		Expend b = new Expend();
		a=b.expend(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	
	public int[] expend(int[] a) {
		a = Arrays.copyOf(a, a.length*2);
		for (int i = a.length/2; i < a.length; i++) {
			a[i] = 0;
		}
		return a;
	}
}

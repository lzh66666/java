package cn.sxt.arrays;
/**
 * ��������ı���
 * @author ¬��
 *
 */
public class Test03 {
	public static void main(String[] args) {
		int[] a=new int[4];
//		��ʼ������Ԫ�ص�ֵ
		for (int i = 0; i < a.length; i++) {
			a[i]=10*i;
		}
//		��ȡԪ�ص�ֵ
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("##########");
//		foreachѭ�������ڶ�ȡ����Ԫ�ص�ֵ�����������޸�
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

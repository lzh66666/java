package �α��ϵİ���.��4_3;
/**
 * �÷���ʵ�����������ݵ�����
 * @author ¬��
 *
 */
public class SelectSort {
	static void SortArray(int[] data) {
		int k,temp;
//		ѭ������i����ÿ������ʱ�Ĵ�����λ��
		for (int i = 0; i < data.length; i++) {
			k = i;
//			kΪ"��ǰ��СԪ��"�±�,ÿ������ʼʱ�ȼٶ�������λ��Ԫ��"��С"
			for (int j = i+1; j < data.length; j++) {
//				�ҵ���С��Ԫ��ʱ,k����Ϊ"��СԪ��"�±�
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

package nuc.ss.Arrays;
/**
 * ���ͷ���(����)
 * @author ¬��
 * @version 2019 11 12 15:45
 */
public class TestPointArray {
	public static void main(String[] args) {
		PrintArray printArray  = new PrintArray();
		
		Integer[] integerArray = {1,2,3,4,5,6};
		Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6};
		Character[] characterArray = {'A','B','C','D','E'};
		
		System.out.println("�����������");
		printArray.printArray(integerArray);
		System.out.println("���˫����С��������");
		printArray.printArray(doubleArray);
		System.out.println("����ַ�������");
		printArray.printArray(characterArray);
	}
}

class PrintArray{
	public<T> void printArray(T[] t) {
		for (T t2 : t) {
			System.out.print(t2 + " ");
		}
		System.out.println();
	}
}

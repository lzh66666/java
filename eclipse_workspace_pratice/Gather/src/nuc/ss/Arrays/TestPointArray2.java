package nuc.ss.Arrays;
/**
 * ������(����)
 * @author ¬��
 * @version 2019 11 12 15:48
 */
public class TestPointArray2 {
	public static void main(String[] args) {
		PrintArray2<Integer> printArray1  = new PrintArray2<Integer>();
		PrintArray2<Double> printArray2  = new PrintArray2<Double>();
		PrintArray2<Character> printArray3  = new PrintArray2<Character>();
		
		Integer[] integerArray = {1,2,3,4,5,6};
		Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6};
		Character[] characterArray = {'A','B','C','D','E'};
		
		System.out.println("�����������");
		printArray1.printArray(integerArray);
		
		System.out.println("���˫����С��������");
		printArray2.printArray(doubleArray);
		System.out.println("����ַ�������");
		printArray3.printArray(characterArray);
	}
}

class PrintArray2<T>{
	public void printArray(T[] t) {
		for (T t2 : t) {
			System.out.print(t2 + " ");
		}
		System.out.println();
	}
}

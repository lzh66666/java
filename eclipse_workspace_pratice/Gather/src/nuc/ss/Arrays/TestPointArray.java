package nuc.ss.Arrays;
/**
 * 泛型方法(数组)
 * @author 卢泽华
 * @version 2019 11 12 15:45
 */
public class TestPointArray {
	public static void main(String[] args) {
		PrintArray printArray  = new PrintArray();
		
		Integer[] integerArray = {1,2,3,4,5,6};
		Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6};
		Character[] characterArray = {'A','B','C','D','E'};
		
		System.out.println("输出整形数组");
		printArray.printArray(integerArray);
		System.out.println("输出双精度小数型数组");
		printArray.printArray(doubleArray);
		System.out.println("输出字符型数组");
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

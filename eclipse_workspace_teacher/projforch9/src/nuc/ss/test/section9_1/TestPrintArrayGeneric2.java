package nuc.ss.test.section9_1;

public class TestPrintArrayGeneric2 {

	public static void main(String[] args) {
		System.out.println("----使用泛型类示例----");
		
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 }; // 应改为包装类型
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	    
	    //分别输出各个数组。
		PrintArrayGeneric2<Integer> printarray1 = new PrintArrayGeneric2<Integer>();
	    System.out.println("输出整型数组:");
	    printarray1.printArray(integerArray); // 应传入包装类对象数组
	    
	    PrintArrayGeneric2<Double> printarray2 = new PrintArrayGeneric2<Double>();
	    System.out.println("\n输出双精度型数组:");
	    printarray2.printArray(doubleArray);
	    
	    PrintArrayGeneric2<Character> printarray3 = new PrintArrayGeneric2<Character>();
	    System.out.println("\n输出字符型数组:");
	    printarray3.printArray(characterArray);

	}

}

class PrintArrayGeneric2 <T> {
	public void printArray(T[] t){
		for(T a: t){
			System.out.print(a + " ");
		}
	}	
}


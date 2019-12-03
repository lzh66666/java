package nuc.ss.test.section9_1;

public class TestPrintArrayGeneric1 {

	public static void main(String[] args) {
		System.out.println("----使用泛型方法示例----");
		
		PrintArrayGeneric printarray = new PrintArrayGeneric();
		
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 }; // 应改为包装类型
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	    
	    //分别输出各个数组。
	    System.out.println("输出整型数组:");
	    printarray.printArray(integerArray); // 应传入包装类对象数组
	    
	    System.out.println("\n输出双精度型数组:");
	    printarray.printArray(doubleArray);
	    
	    System.out.println("\n输出字符型数组:");
	    printarray.printArray(characterArray);

	}

}

class PrintArrayGeneric {
	public <T> void printArray(T[] t){ //根据传入的参数进行参数类型的推断。这里的情况比较简单，因为只有一个参数，只需要根据传入的参数的实际类型确定参数类型即可。
		for(T a: t){
			System.out.print(a + " ");
		}
	}	
}


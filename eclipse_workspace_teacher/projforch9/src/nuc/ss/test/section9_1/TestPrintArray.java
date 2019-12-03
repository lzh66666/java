package nuc.ss.test.section9_1;

public class TestPrintArray {
	public static void main(String[] args) {
	
		PrintArray printarray = new PrintArray();
		
		//创建了三个不同类型的数组
		int[] integerArray = { 1, 2, 3, 4, 5, 6 };
		double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    char[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	    
	    //分别输出各个数组的内容
	    System.out.println("输出整型数组:");
	    printarray.printArray(integerArray);
	    
	    System.out.println("\n输出双精度型数组:");
	    printarray.printArray(doubleArray);
	    
	    System.out.println("\n输出字符型数组:");
	    printarray.printArray(characterArray);
	}
}

class PrintArray {  // 这里使用方法重载
	public void printArray(int[] t){
		for(int a: t){
			System.out.print(a + " ");
		}
	}
	public void printArray(double[] t){
		for(double a: t){
			System.out.print(a + " ");
		}
	}
	public void printArray(char[] t){
		for(char a: t){
			System.out.print(a + " ");
		}
	}	
}


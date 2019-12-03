package nuc.ss.test.section9_1;

public class TestPrintArrayGeneric2 {

	public static void main(String[] args) {
		System.out.println("----ʹ�÷�����ʾ��----");
		
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 }; // Ӧ��Ϊ��װ����
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	    
	    //�ֱ�����������顣
		PrintArrayGeneric2<Integer> printarray1 = new PrintArrayGeneric2<Integer>();
	    System.out.println("�����������:");
	    printarray1.printArray(integerArray); // Ӧ�����װ���������
	    
	    PrintArrayGeneric2<Double> printarray2 = new PrintArrayGeneric2<Double>();
	    System.out.println("\n���˫����������:");
	    printarray2.printArray(doubleArray);
	    
	    PrintArrayGeneric2<Character> printarray3 = new PrintArrayGeneric2<Character>();
	    System.out.println("\n����ַ�������:");
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


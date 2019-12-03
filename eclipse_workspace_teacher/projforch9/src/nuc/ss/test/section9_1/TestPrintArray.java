package nuc.ss.test.section9_1;

public class TestPrintArray {
	public static void main(String[] args) {
	
		PrintArray printarray = new PrintArray();
		
		//������������ͬ���͵�����
		int[] integerArray = { 1, 2, 3, 4, 5, 6 };
		double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    char[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	    
	    //�ֱ�����������������
	    System.out.println("�����������:");
	    printarray.printArray(integerArray);
	    
	    System.out.println("\n���˫����������:");
	    printarray.printArray(doubleArray);
	    
	    System.out.println("\n����ַ�������:");
	    printarray.printArray(characterArray);
	}
}

class PrintArray {  // ����ʹ�÷�������
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


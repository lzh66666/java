package nuc.ss.test.section9_1;

public class TestPrintArrayGeneric1 {

	public static void main(String[] args) {
		System.out.println("----ʹ�÷��ͷ���ʾ��----");
		
		PrintArrayGeneric printarray = new PrintArrayGeneric();
		
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 }; // Ӧ��Ϊ��װ����
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	    
	    //�ֱ�����������顣
	    System.out.println("�����������:");
	    printarray.printArray(integerArray); // Ӧ�����װ���������
	    
	    System.out.println("\n���˫����������:");
	    printarray.printArray(doubleArray);
	    
	    System.out.println("\n����ַ�������:");
	    printarray.printArray(characterArray);

	}

}

class PrintArrayGeneric {
	public <T> void printArray(T[] t){ //���ݴ���Ĳ������в������͵��ƶϡ����������Ƚϼ򵥣���Ϊֻ��һ��������ֻ��Ҫ���ݴ���Ĳ�����ʵ������ȷ���������ͼ��ɡ�
		for(T a: t){
			System.out.print(a + " ");
		}
	}	
}


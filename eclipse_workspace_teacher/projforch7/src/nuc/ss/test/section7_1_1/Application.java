package nuc.ss.test.section7_1_1;

public class Application {
	public static void main(String args[]) {
		A a = new B();   			//a��B��������ת�Ͷ���
    	int m = a.add(3, 2); 		//a��������B��д��add()����
    	System.out.println(m);  	//������Ϊ5
    }
}

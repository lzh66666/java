package nuc.ss.test.section7_1_2;

public class Application {
    public static void main(String args[]) {
         Com com = new ComImp();   	//com�������ComImp��Ķ��������
         int m = com.sub(8, 2); 	//com�ص�ComImp��ʵ�ֵĽӿڷ���
         System.out.println(m);  	//������Ϊ6
    }
}

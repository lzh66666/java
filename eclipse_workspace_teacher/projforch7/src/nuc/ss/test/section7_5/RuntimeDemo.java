package nuc.ss.test.section7_5;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("mspaint"); //�򿪻�ͼ���
		//r.exec("notepad"); //�򿪼��±����
		//r.exec("calc");//�򿪼�����
		//r.exec("shutdown -s -t 10000");//��ʱ�ػ���10000�����ػ�
		//r.exec("shutdown -a"); //ȡ���ػ�����
		
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r == r2);	
	}
}


//Runtime�Ĳ���Դ�룺ʹ���˵���ģʽ�Ķ���ʽ
/*class Runtime {
	private static Runtime currentRuntime = new Runtime();
	
	private Runtime() {}

	public static Runtime getRuntime() {
		return currentRuntime;
	}
}*/


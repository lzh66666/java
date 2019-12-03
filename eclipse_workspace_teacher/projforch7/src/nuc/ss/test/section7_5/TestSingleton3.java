package nuc.ss.test.section7_5;

//����ʽ: ����ʽ���������Լ�������ʱ�ͽ��Լ�ʵ������
class Singleton3 {
	private static Singleton3 instance = new Singleton3();  //��̬˽�г�Ա����
	private String info = "����ʽ����ģʽʾ��";
	//˽�й��캯��
	private Singleton3() {	
	}
	//��̬���й�������������Ψһʵ��
	public static Singleton3 getInstance() {		
		return instance;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}

public class TestSingleton3 {
	public static void main(String[] args) {
		Singleton3 st = Singleton3.getInstance();
		System.out.println(st.getInfo());
		
	}
}

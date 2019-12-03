package nuc.ss.test.section7_5;

class Singleton2 {
	private static Singleton2 instance = null;  //��̬˽�г�Ա����
	private String info = "����ģʽʾ��";
	//˽�й��캯��
	private Singleton2() {	
	}
	//��̬���й�������������Ψһʵ��
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
        }	
		
		return instance;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}

public class TestSingleton2 {
	public static void main(String[] args) {
		Singleton2 st = Singleton2.getInstance();
		System.out.println(st.getInfo());
		
	}
}


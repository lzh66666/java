package nuc.ss.test.section6_2;

public class TestInterfaceSpeak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISpeak speak = new ISpeak() {
			public void speakHello() {
				System.out.println("��Һã�ףѧϰ������");
			}
		};
		speak.speakHello();
	}

}

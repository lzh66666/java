package nuc.ss.test.section6_2_a;

public class TestAbstractSpeak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak speak = new Speak("NUC-SS") {
			public void speakHello() {
				System.out.println("��Һã�ףѧϰ������");
			}
		};
		speak.speakHello();
		System.out.println(speak.getInfo());
	}

}

package nuc.ss.test.section6_2;

public class TestAbstractSpeak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak speak = new Speak() {
			public void speakHello() {
				System.out.println("大家好！祝学习进步！");
			}
		};
		speak.speakHello();
	}

}

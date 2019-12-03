package nuc.ss.test.section6_2;

class MySpeak extends Speak {
	@Override
	public void speakHello() {
		// TODO Auto-generated method stub
		System.out.println("大家好!祝学习进步!");
	}
	
}

public class TestAbstractSpeak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak speak = new MySpeak();
		speak.speakHello();
	}

}

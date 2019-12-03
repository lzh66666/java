package nuc.ss.test.section6_2;

class ISpeakImpl implements ISpeak {
	@Override
	public void speakHello() {
		// TODO Auto-generated method stub
		System.out.println("大家好!祝学习进步!");
	}
	
}

public class TestInterfaceSpeak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISpeak speak = new ISpeakImpl();
		speak.speakHello();
	}

}

package nuc.ss.test.section6_2;

class MySpeak extends Speak {
	@Override
	public void speakHello() {
		// TODO Auto-generated method stub
		System.out.println("��Һ�!ףѧϰ����!");
	}
	
}

public class TestAbstractSpeak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak speak = new MySpeak();
		speak.speakHello();
	}

}

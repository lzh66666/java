package nuc.ss.test.section6_2_a;

class MySpeak extends Speak {
	public MySpeak(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void speakHello() {
		// TODO Auto-generated method stub
		System.out.println("大家好!祝学习进步!");
	}
	
}

public class TestAbstractSpeak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak speak = new MySpeak("NUC");
		speak.speakHello();
		System.out.println(speak.getInfo());
	}

}

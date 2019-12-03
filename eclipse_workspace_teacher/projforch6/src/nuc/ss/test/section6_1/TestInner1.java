package nuc.ss.test.section6_1;

public class TestInner1 {
	public static void main(String[] args) {
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.show();
	}
}

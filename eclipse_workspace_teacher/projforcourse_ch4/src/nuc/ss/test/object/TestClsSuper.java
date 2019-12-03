package nuc.ss.test.object;

public class TestClsSuper{

	public static void main(String[] args) {
		ClsSuper csp = new ClsSuper();
		csp.show();
		System.out.println(csp);
	}
}

class ClsSuper{
	public void show(){
		System.out.println("Hello world!");
	}
}

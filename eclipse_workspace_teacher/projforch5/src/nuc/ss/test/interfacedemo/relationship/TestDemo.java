package nuc.ss.test.interfacedemo.relationship;

interface  IComputable {   //�ӿ�
	int add(int x, int y);
	int sub(int a, int y);
}

abstract class ClsA  implements  IComputable{   //ֻʵ�ֽӿ���ĳЩ������
	public int add(int x, int y){
		return x + y;
	}
}

class ClsB extends ClsA {
	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClsB b = new ClsB();
		System.out.println("3 + 9 = " + b.add(3, 9));
		System.out.println("3 - 9 = " + b.sub(3, 9));
	}

}

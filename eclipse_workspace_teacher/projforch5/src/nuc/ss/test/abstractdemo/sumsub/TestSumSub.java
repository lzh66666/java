package nuc.ss.test.abstractdemo.sumsub;

abstract class A {
    abstract int sum(int x, int y);    // ���󷽷�
    int sub(int x, int y) {            // �ǳ��󷽷�
           return x - y;
   }
}
class B extends A {
    int sum(int x, int y) {   //���������д�����sum����
          return x + y;
   }
}
public class TestSumSub {
    public static void main(String[] args) {
    	B b = new B();
    	System.out.println(b.sum(30, 20));
    	System.out.println(b.sub(30, 20));
    }
}

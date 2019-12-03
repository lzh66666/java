package nuc.ss.test.abstractdemo.sumsub;

abstract class A {
    abstract int sum(int x, int y);    // 抽象方法
    int sub(int x, int y) {            // 非抽象方法
           return x - y;
   }
}
class B extends A {
    int sum(int x, int y) {   //子类必须重写父类的sum方法
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

package nuc.ss.test.abstractdemo.sumsub;

abstract class A {
    abstract int sum(int x,int y);    // 抽象方法
    int sub(int x,int y) {                    // 非抽象方法
           return x-y;
   }
}
class B extends A {
    int sum(int x, int y) {   //子类必须重写父类的sum方法
          return x+y;
   }
}
public class TestSumSub {
    public static void main(String args[]) {
           B b=new B();
           int sum=b.sum(30,20);           //调用重写的方法
           int sub=b.sub(30,20);             //调用继承的方法
           System.out.println("sum="+sum);
           System.out.println("sub="+sub); 
    }
}

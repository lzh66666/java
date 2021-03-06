package nuc.ss.test.section9_9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

/**
  *本类用于测试反射API，利用用户输入类的全路径，
  *找到该类所有的成员方法和成员属性
  */
public class MyTest {
    /**
     *构造方法
     */
    public MyTest(){
       String classInfo = JOptionPane.showInputDialog(null, "输入类全路径");//要求用户输入类的全路径
       try {
           Class cla = Class.forName(classInfo);//根据类的全路径进行类加载，返回该类的Class对象
           
           Constructor[] constructors = cla.getDeclaredConstructors();
           
           for (Constructor me : constructors) {//遍历该类方法的集合
               System.out.println(me.toString());//打印方法信息
           }
           
           System.out.println("********");
           
           Method[] methods = cla.getDeclaredMethods();//利用得到的Class对象的自审，返回方法对象集合
          
           for (Method me : methods) {//遍历该类方法的集合
              System.out.println(me.toString());//打印方法信息
           }
          
           System.out.println("********");

           Field[] fields = cla.getDeclaredFields();//利用得到的Class对象的自审，返回属性对象集合
           for (Field me : fields) { //遍历该类属性的集合
              System.out.println(me.toString());//打印属性信息
           }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
    public static void main(String[] args) {
       new MyTest();
    }
}
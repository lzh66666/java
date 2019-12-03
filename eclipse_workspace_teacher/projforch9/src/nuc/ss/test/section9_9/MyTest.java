package nuc.ss.test.section9_9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

/**
  *�������ڲ��Է���API�������û��������ȫ·����
  *�ҵ��������еĳ�Ա�����ͳ�Ա����
  */
public class MyTest {
    /**
     *���췽��
     */
    public MyTest(){
       String classInfo = JOptionPane.showInputDialog(null, "������ȫ·��");//Ҫ���û��������ȫ·��
       try {
           Class cla = Class.forName(classInfo);//�������ȫ·����������أ����ظ����Class����
           
           Constructor[] constructors = cla.getDeclaredConstructors();
           
           for (Constructor me : constructors) {//�������෽���ļ���
               System.out.println(me.toString());//��ӡ������Ϣ
           }
           
           System.out.println("********");
           
           Method[] methods = cla.getDeclaredMethods();//���õõ���Class��������󣬷��ط������󼯺�
          
           for (Method me : methods) {//�������෽���ļ���
              System.out.println(me.toString());//��ӡ������Ϣ
           }
          
           System.out.println("********");

           Field[] fields = cla.getDeclaredFields();//���õõ���Class��������󣬷������Զ��󼯺�
           for (Field me : fields) { //�����������Եļ���
              System.out.println(me.toString());//��ӡ������Ϣ
           }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
    public static void main(String[] args) {
       new MyTest();
    }
}
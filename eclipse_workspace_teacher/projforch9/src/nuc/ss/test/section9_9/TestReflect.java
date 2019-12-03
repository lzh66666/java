package nuc.ss.test.section9_9;

import java.lang.reflect.Field;

public class TestReflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //��һ�ַ�ʽ��ȡClass����    
		Student stu1 = new Student(18001, "����", 85.5f);    //��һnew ����һ��Student����һ��Class����  
		Class stuClass = stu1.getClass();//��ȡClass����  
		System.out.println(stuClass.getName());  

		//�ڶ��ַ�ʽ��ȡClass����  
	     Class stuClass2 = Student.class;  
		 System.out.println(stuClass == stuClass2);//�жϵ�һ�ַ�ʽ��ȡ��Class����͵ڶ��ַ�ʽ��ȡ���Ƿ���ͬһ��  
	
		//�����ַ�ʽ��ȡClass����  
		try {  
		     Class stuClass3 = Class.forName("nuc.ss.test.section9_9.Student");//ע����ַ�����������ʵ·�������Ǵ���������·��������.����  
		     System.out.println(stuClass3 == stuClass2);//�ж����ַ�ʽ�Ƿ��ȡ����ͬһ��Class����  
		} catch (ClassNotFoundException e) {  
		     e.printStackTrace();  
		}  
		
		System.out.println("************��ȡ���й��е��ֶ�********************");  
		Field[] fieldArray = stuClass.getFields();  
		for(Field f : fieldArray){  
		     System.out.println(f);  
		}  
		System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");  
		fieldArray = stuClass.getDeclaredFields();  
		for(Field f : fieldArray){  
		     System.out.println(f);  
		}  
		
		 //��ȡһ������  
		 try {
			Student obj = (Student)stuClass.getConstructor().newInstance();
			obj.setName("��");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

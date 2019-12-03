package nuc.ss.test.section9_9xhl;

import java.lang.reflect.Field;

import nuc.ss.test.section9_4.Student;

public class TestReflect {

	public static void main(String[] args) {

		 //ʹ�õ�һ�ַ�ʽ��ȡClass����    
		Student stu1 = new Student();    //��һnew ����һ��Student����һ��Class����  
		Class stuClass = stu1.getClass();//��ȡClass����  
		System.out.println(stuClass.getName());  

		//ʹ�õڶ��ַ�ʽ��ȡClass����  
	     Class stuClass2 = Student.class;  
		 System.out.println(stuClass == stuClass2);//�жϵ�һ�ַ�ʽ��ȡ��Class����͵ڶ��ַ�ʽ��ȡ���Ƿ���ͬһ��  
	
		//ʹ�õ����ַ�ʽ��ȡClass����  
		try {  
		     Class stuClass3 = Class.forName("nuc.ss.test.section9_4.Student");//ע����ַ�����������ʵ·�������Ǵ���������·��������.����  
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
		System.out.println("************��ȡһ������ʵ���������䷽��********************");  
		 //��ȡһ������  
		try {
			Student obj = (Student)stuClass.getConstructor().newInstance();
			obj.setAge(19);
			obj.setId(1801);
			obj.setName("���޼�");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


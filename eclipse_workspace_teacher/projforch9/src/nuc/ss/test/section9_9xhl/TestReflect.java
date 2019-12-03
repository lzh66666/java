package nuc.ss.test.section9_9xhl;

import java.lang.reflect.Field;

import nuc.ss.test.section9_4.Student;

public class TestReflect {

	public static void main(String[] args) {

		 //使用第一种方式获取Class对象    
		Student stu1 = new Student();    //这一new 产生一个Student对象，一个Class对象。  
		Class stuClass = stu1.getClass();//获取Class对象  
		System.out.println(stuClass.getName());  

		//使用第二种方式获取Class对象  
	     Class stuClass2 = Student.class;  
		 System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个  
	
		//使用第三种方式获取Class对象  
		try {  
		     Class stuClass3 = Class.forName("nuc.ss.test.section9_4.Student");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名  
		     System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象  
		} catch (ClassNotFoundException e) {  
		     e.printStackTrace();  
		}  
		
		System.out.println("************获取所有公有的字段********************");  
		Field[] fieldArray = stuClass.getFields();  
		for(Field f : fieldArray){  
		     System.out.println(f);  
		}  
		System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");  
		fieldArray = stuClass.getDeclaredFields();  
		for(Field f : fieldArray){  
		     System.out.println(f);  
		}  
		System.out.println("************获取一个对象实例并调用其方法********************");  
		 //获取一个对象  
		try {
			Student obj = (Student)stuClass.getConstructor().newInstance();
			obj.setAge(19);
			obj.setId(1801);
			obj.setName("张无忌");
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}


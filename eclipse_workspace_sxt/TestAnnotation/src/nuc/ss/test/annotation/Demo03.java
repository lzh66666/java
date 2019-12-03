package nuc.ss.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解党的信息,模拟处理注解信息的流程
 * @author 卢泽华
 * @version 2019 11 9 17:43
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("nuc.ss.test.annotation.Student");
			//获得类的所有有效注解
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			//获得类指定的注解
			Table st = (Table) clazz.getAnnotation(Table.class);
			System.out.println(st.value());
			
			//获得类的属性的注解
			Field f = clazz.getDeclaredField("studentName");
			MyField field = f.getAnnotation(MyField.class);
			System.out.println(field.columnName() + "--" + field.type() + "--" + field.length());
			
			//根据获得的表名,字段的信息,找出DDL语句,然后使用JDBC执行这个SQL,在数据库中生成相关的表
			//...
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

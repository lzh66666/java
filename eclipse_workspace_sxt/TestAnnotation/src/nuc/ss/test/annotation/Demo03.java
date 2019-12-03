package nuc.ss.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * ʹ�÷����ȡע�⵳����Ϣ,ģ�⴦��ע����Ϣ������
 * @author ¬��
 * @version 2019 11 9 17:43
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("nuc.ss.test.annotation.Student");
			//������������Чע��
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			//�����ָ����ע��
			Table st = (Table) clazz.getAnnotation(Table.class);
			System.out.println(st.value());
			
			//���������Ե�ע��
			Field f = clazz.getDeclaredField("studentName");
			MyField field = f.getAnnotation(MyField.class);
			System.out.println(field.columnName() + "--" + field.type() + "--" + field.length());
			
			//���ݻ�õı���,�ֶε���Ϣ,�ҳ�DDL���,Ȼ��ʹ��JDBCִ�����SQL,�����ݿ���������صı�
			//...
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

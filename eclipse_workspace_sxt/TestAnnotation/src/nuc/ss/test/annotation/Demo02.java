package nuc.ss.test.annotation;

@MyAnnotation01
public class Demo02 {
	
	@MyAnnotation01(age = 19,studentName = "��¬",id = 1001,schools= {"������ѧ","�������캽�մ�ѧ"})
	public void test() {
		
	}
	
	@Annotation02("aaa")//value����ʡ��
	public void test2() {
		
	}
	public static void main(String[] args) {
		System.out.println("123");
	}
	
}

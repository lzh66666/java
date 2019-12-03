package nuc.ss.test.annotation;

@MyAnnotation01
public class Demo02 {
	
	@MyAnnotation01(age = 19,studentName = "老卢",id = 1001,schools= {"北京大学","北京航天航空大学"})
	public void test() {
		
	}
	
	@Annotation02("aaa")//value可以省略
	public void test2() {
		
	}
	public static void main(String[] args) {
		System.out.println("123");
	}
	
}

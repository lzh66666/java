package cn.sxt.oo2;
/**
 * ����Object-toString
 * @author ¬��
 *
 */
public class TestObject {
	public static void main(String[] args) {
//		Object obj;
		TestObject to=new TestObject();
//		System.out.println(to);
		System.out.println(to.toString());
		
		person2 p2=new person2("����", 6);
		System.out.println(p2.toString());
	} 
	public String toString() {
		return "����Object����";
	}
	
}

class person2{
	String name;
	int age;
	
	@Override
	public String toString() {
		return name+"����:"+age;
	}
	
	public person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

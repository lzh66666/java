package cn.sxt.oo2;
/**
 * ²âÊÔObject-toString
 * @author Â¬Ôó»ª
 *
 */
public class TestObject {
	public static void main(String[] args) {
//		Object obj;
		TestObject to=new TestObject();
//		System.out.println(to);
		System.out.println(to.toString());
		
		person2 p2=new person2("ÎûÎû", 6);
		System.out.println(p2.toString());
	} 
	public String toString() {
		return "²âÊÔObject¶ÔÏó";
	}
	
}

class person2{
	String name;
	int age;
	
	@Override
	public String toString() {
		return name+"ÄêÁä:"+age;
	}
	
	public person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

package nuc.ss.test.object;

public class TestEquals {
	public static void main(String[] args) {		
		Person p1 = new Person("140108198006230421", "张三");
		Person p2 = new Person("140108198006230421", "张三");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}


package cn.lu01;
/**
 * 静态变量调用
 * @author Administrator
 *
 */
public class StaticTest {
	public static void main(String[] args) {
		Emloyee[] staff=new Emloyee[3];
		
		staff[0]=new Emloyee("Tom", 40000);
		staff[1]=new Emloyee("Dick", 60000);
		staff[2]=new Emloyee("Harry", 65000);
		
		for (Emloyee e : staff) {
			e.setId();
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
		
		int n=Emloyee.getNextId();
		System.out.println("Next available id="+n);
	}
}


class Emloyee{
	private static int nextId = 1;//静态域
	
	private String name;
	private double salary;
	private int id;
	
	public Emloyee(String n,double s) {
		name=n;
		salary=s;
		id=0;
	}
//	静态方法
	public static int getNextId() {
		return nextId;
	}

	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public int getId() {
		return id;
	}

	public void setId() {
		id=nextId;
		nextId++;
	}
	
	public static void main(String[] args) {
		Emloyee e=new Emloyee("Harry", 50000);
		System.out.println(e.getName()+" "+e.getSalary());
	}	
}
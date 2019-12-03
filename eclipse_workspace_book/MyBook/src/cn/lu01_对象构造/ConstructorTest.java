package cn.lu01_������;

import java.util.Random;

/**
 * ���Թ�����
 * @author ¬��
 *
 */
public class ConstructorTest {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry",40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		for (Employee e : staff) {
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
	}
}

class Employee{
	private static int nextId;
	
	private int id;
	private String name="";
	private double salary;
//	static���ʼ��
	static {
		Random generator = new Random();
		nextId = generator.nextInt(1000);
	}
//	object���ʼ��
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String n,double s) {
		name = n;
		salary = s;
	}
	
	public Employee(double s) {
		this("Employee #"+nextId,s);
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
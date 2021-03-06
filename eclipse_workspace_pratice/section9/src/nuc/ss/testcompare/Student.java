package nuc.ss.testcompare;

public class Student implements Comparable<Object>{
	
	private int id;
	private String name;
	private int age;
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String toString() {
		return name + " 同学的学号是: " + id + " 年龄是: " + age + "。";
	}
	
	
	@Override
	public int compareTo(Object o) {
		Student stu = (Student)o;
		if(this.age < stu.age) {
			return 1;
		}else if(this.age > stu.age) {
			return -1;
		}else {
			if(this.id > stu.id) {
				return 1;
			}else if(this.id < stu.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	/*
	 * @Override public int compareTo(Object o) { return ((Student)o).getId() -
	 * this.id; }
	 * 
	 */}

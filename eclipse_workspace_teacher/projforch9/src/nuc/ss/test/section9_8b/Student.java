package nuc.ss.test.section9_8b;

public class Student implements Comparable {
	private int id;
	private String name;
	private int age;
	
	public Student(){	
	}
	
	public Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return name + " ͬѧ��ѧ���ǣ�" + id 
				    + ",�����ǣ�" + age + "��";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return this.getAge() - ((Student)o).getAge(); // ��������������
		return ((Student)o).getAge() - this.getAge(); // �����併������
		//return this.getId() - ((Student)o).getId(); // ��ѧ����������
	    //return ((Student)o).getId() - this.getId(); // ��ѧ�Ž�������
		
	}

}


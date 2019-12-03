package nuc.ss.test.section9_4;

public class Student{
	private int id;
	private String name;
	private int age;
	
	public Student(){	
	}
	
	public Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
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
		return name + " 同学的学号是：" + id + ",年龄是：" + age + "。";
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	@Override
	public int hashCode() {
		return (int)(id + name.hashCode() + age);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)  return true;
		if(obj instanceof Student){
			 Student stu = (Student)obj;
			if((stu.getId() == id) && (stu.getName().equals(name)) 
	                      && (stu.getAge() == age)){
				return true;	
			}else{
				return false;	
			}
		}else{
			return false;	
		}
	}

	
}


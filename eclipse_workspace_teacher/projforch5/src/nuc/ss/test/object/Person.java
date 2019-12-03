package nuc.ss.test.object;

public class Person {
	private String id;
	private String name;
	
	public Person(String id,String name) {
		this.id = id;
		this.name = name;	
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "姓名：" + name + ";身份证号：" + id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){
			Person  p = (Person)obj;	
			if(p.getId().equals(this.getId()) && p.getName().equals(this.getName())){
			    return true; //对象的身份证号及姓名均相等，则对象等
		    }
			else{
			    return false; //对象的身份证号或姓名不等，则对象不等。
		    }
		}
		else{
			return false;	//类型不同，直接返回不等
		}
	}	
}

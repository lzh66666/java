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
		return "������" + name + ";���֤�ţ�" + id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){
			Person  p = (Person)obj;	
			if(p.getId().equals(this.getId()) && p.getName().equals(this.getName())){
			    return true; //��������֤�ż���������ȣ�������
		    }
			else{
			    return false; //��������֤�Ż��������ȣ�����󲻵ȡ�
		    }
		}
		else{
			return false;	//���Ͳ�ͬ��ֱ�ӷ��ز���
		}
	}	
}

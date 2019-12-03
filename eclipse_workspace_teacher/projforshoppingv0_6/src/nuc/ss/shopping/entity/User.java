package nuc.ss.shopping.entity;

public class User implements Cloneable{
	private String id; 			// �û����
	private String name; 		// �û���ʵ����
	private String password; 	// �û�����
	private byte sex; 			// �û��Ա�: 1�У� 0Ů
	private String city; 		// ���ڳ���
	
/*	// ShoppingCart��User�����ϵΪ�����
	private ShoppingCart cart = null; // ÿ���û�����һ��ר���Ĺ��ﳵ

	public User() {
		cart = new ShoppingCart();
	}*/

	public User(String id, String name, String password, Byte sex, String city) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "�û���ţ�" + this.getId() + " | �û�����" + this.getName()
				+ " | �Ա�" + this.getSex() + " | ���ڳ��У�" + this.getCity();
	}

/*	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/
}
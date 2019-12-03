package projfor_c113_lzh.shopping.entity;

public class User implements Cloneable{
	private String id;
	private String name;
	private String password;
	private byte sex;
	private String city;
	
	public User(String id, String name, String password, byte sex, String city) {
		super();
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

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
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
		return " 用户编号：" + id + ", 用户姓名：" + name + ", 性别：" + sex + ", 所在城市：" + city;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
        return super.clone();
    }

}

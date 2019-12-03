package nuc.ss.shopping.entity;

public class User implements Cloneable{
	private String id; 			// 用户编号
	private String name; 		// 用户真实姓名
	private String password; 	// 用户密码
	private byte sex; 			// 用户性别: 1男， 0女
	private String city; 		// 所在城市
	
/*	// ShoppingCart与User的类关系为：组合
	private ShoppingCart cart = null; // 每个用户都有一个专属的购物车

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
		return "用户编号：" + this.getId() + " | 用户名：" + this.getName()
				+ " | 性别：" + this.getSex() + " | 所在城市：" + this.getCity();
	}

/*	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/
}

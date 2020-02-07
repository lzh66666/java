package nuc.ss.examination.entry;

public class User {
	private String name;// ���������洢�û�������
	private String id;// ���������洢�û������֤
	private String account;// ���������洢�˺�
	private String password;// ���������洢����
	private String type;// ���������洢�û�����

	public User() {

	}

	public User(String account, String password, String type) {
		this.account = account;
		this.password = password;
		this.type = type;
	}

	public User(String name, String id, String account, String password, String type) {
		this(account, password, type);
		this.id = id;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return name + "-" + id + "-" + account + "-" + password + "-" + type;
	}
}

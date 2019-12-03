package nuc.ss.test1_2;

import java.io.Serializable;

public class Users implements Serializable{
	private String name;
	private int phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Users(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [����=" + name + ", �绰=" + phone + "]";
	}
	
	public boolean check(String name) {
		if(name.equals(this.name)) {                         
			return true;
		}else {
			return false;
		}
	}
}
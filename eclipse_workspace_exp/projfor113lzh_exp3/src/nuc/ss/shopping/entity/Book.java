package nuc.ss.shopping.entity;

/**
 * 
 * �鼮ʵ����
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class Book {

	private String bid; // �鼮���
	private String name; // �鼮����
	private String author; // �鼮����
	private int number; // �鼮���
	private Category category; // �鼮��ϸ���ࣨ��Ŀ��

	public Book() {
	}

	public Book(String bid, String name, String author, int number,
			Category category) {
		this.bid = bid;
		this.author = author;
		this.name = name;
		this.number = number;
		this.category = category;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * ͨ��toString��ʾ�鼮��Ϣ
	 */
	public String toString() {
		return "��Ʒ��ţ�" + this.getBid() + " | ��Ʒ����" + this.getName() + "| ��Ŀ��"
				+ this.getCategory() + " | ��Ʒ������" + this.getNumber();
	}

}

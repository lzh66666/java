package cn.campsg.gm.entit;

public class Book {
	private String bid;//�鼮���
	public String name;
	public String author;
	public int number;//�鼮���
	public Category category;//�鼮��ϸ����
	
	
	
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


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Book() {
		
	}

	public Book(String bid, String name, String author, int number, Category category) {
		super();
		this.bid = bid;
		this.name = name;
		this.author = author;
		this.number = number;
		this.category = category;
	}
	
	
	@Override
	public String toString() {
		return "��Ʒ��� :  " + bid + " | ��Ʒ�� : " + name + " | ��Ŀ :  " + category+ " | ��Ʒ���� : " + number ;
	}
	
}

package nuc.ss.shopping.entity;

public class Book {
	private String bid;
	private String name;
	private String author;
	private int number;
	private Category category;
	
	public Book() {
		super();
	}

	public Book(String bid, String name, String author, int number, Category category) {
		super();
		this.bid = bid;
		this.name = name;
		this.author = author;
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

	@Override
	public String toString() {
		return "商品编号：" + bid + "| 商品名称：" + name + "| 类目：" + category + "| 库存量：" + number;
	}
	
}

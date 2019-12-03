package nuc.ss.shopping.entity;

/**
 * 
 * 书籍实体类
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8（建议）
 */
public class Book {

	private String bid; // 书籍编号
	private String name; // 书籍名字
	private String author; // 书籍作者
	private int number; // 书籍库存
	private Category category; // 书籍详细分类（类目）

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
	 * 通过toString显示书籍信息
	 */
	public String toString() {
		return "商品编号：" + this.getBid() + " | 商品名：" + this.getName() + "| 类目："
				+ this.getCategory() + " | 商品总数：" + this.getNumber();
	}

}

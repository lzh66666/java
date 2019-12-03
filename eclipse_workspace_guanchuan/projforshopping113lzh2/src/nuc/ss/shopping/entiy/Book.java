package nuc.ss.shopping.entiy;

public class Book {
	private String bid;
	private String name;
	private String firstLevel;
	private String secondLevel;
	private String author;
	private String price;
	private String num;
	
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	

	public String getFirstLevel() {
		return firstLevel;
	}

	public void setFirstLevel(String firstLevel) {
		this.firstLevel = firstLevel;
	}

	public String getSecondLevel() {
		return secondLevel;
	}

	public void setSecondLevel(String secondLevel) {
		this.secondLevel = secondLevel;
	}

	public Book(String[] strs) {
		this.bid = strs[0];
		this.name = strs[1];
		this.firstLevel = strs[2];
		this.secondLevel = strs[3];
		this.author = strs[4];
		this.price = strs[5];
		this.num = strs[6];
		
	}
	
	
	public Book(String bid, String name, String firstLevel, String secondLevel, String author, String price,
			String num) {
		super();
		this.bid = bid;
		this.name = name;
		this.firstLevel = firstLevel;
		this.secondLevel = secondLevel;
		this.author = author;
		this.price = price;
		this.num = num;
	}

	@Override
	public String toString() {
		return bid + "ح" + name + "ح" + firstLevel + "ح" + secondLevel + "ح" 
				+ author + "ح" + price + "ح" + num;
	}
	
}

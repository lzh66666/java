package nuc.ss.shopping.entity;

public class BookDataSet {
	private Book[] books;

	public BookDataSet() {
		books = new Book[4];
		Category category1 = new Category(1, "工具类", "软件编程");
		Category category2 = new Category(2, "小说类", "历史");
		
		books[0] = new Book("b01", "Java程序设计", "鹏彭", 100, category1);
		books[1] = new Book("b02", "名著-三国演义", "罗贯中", 50, category2);
		books[2] = new Book("b03", "名著-水浒传", "施耐庵", 40, category2);
		books[3] = new Book("b04", "名著-红楼梦", "曹雪芹", 30, category2);
				
	}

	public Book[] getBooks() {
		return books;
	}
	
}

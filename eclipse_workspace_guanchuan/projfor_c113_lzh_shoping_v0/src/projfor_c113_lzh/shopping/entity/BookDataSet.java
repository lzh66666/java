package projfor_c113_lzh.shopping.entity;

/**
 * 
 * 书籍数据集
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8（建议）
 */
public class BookDataSet {

	public static final Integer BOOK_QUANTITY = 4;

	private Book[] books = null;
	
	public BookDataSet() {
		books = new Book[BOOK_QUANTITY];
		Category category1 = new Category(1,"工具类","软件编程");
		Category category2 = new Category(2,"小说类","历史");
		books[0] = new Book("b01", "Java核心技术", "霍斯特曼", 50, category1);
		books[1] = new Book("b02", "名著-三国演义", "罗贯中", 40, category2);
		books[2] = new Book("b03", "名著-水浒传", "施耐庵", 30, category2);
		books[3] = new Book("b04", "名著-红楼梦", "曹雪芹", 20, category2);
	}
	
	public Book[] getBooks() {
		return this.books;
	}
}

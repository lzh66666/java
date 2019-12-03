package projfor_c113_lzh.shopping.entity;

/**
 * 
 * �鼮���ݼ�
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class BookDataSet {

	public static final Integer BOOK_QUANTITY = 4;

	private Book[] books = null;
	
	public BookDataSet() {
		books = new Book[BOOK_QUANTITY];
		Category category1 = new Category(1,"������","������");
		Category category2 = new Category(2,"С˵��","��ʷ");
		books[0] = new Book("b01", "Java���ļ���", "��˹����", 50, category1);
		books[1] = new Book("b02", "����-��������", "�޹���", 40, category2);
		books[2] = new Book("b03", "����-ˮ䰴�", "ʩ����", 30, category2);
		books[3] = new Book("b04", "����-��¥��", "��ѩ��", 20, category2);
	}
	
	public Book[] getBooks() {
		return this.books;
	}
}

package cn.campsg.gm.entit;

public class BookDataSet {
	private Book books[];
	
	public BookDataSet() {
		books = new Book[4];
		
		Category category1 = new Category(1,"������","������");
		Category category2 = new Category(2,"С˵��","��ʷ");
		
		books[0] = new Book("b01","JAVA���ļ���","��˹����",50,category1);
		books[1] = new Book("b02","����-��������","�޹���",40,category2);
		books[2] = new Book("b03","����-ˮ䰴� ","ʩ����",30,category2);
		books[3] = new Book("b04","����-��¥�� ","��ѩ�� ",20,category2);
		
	}
	
	
	public Book[] getBooks() {
		return books;
	}
}

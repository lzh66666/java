package nuc.ss.shopping.dao;

import java.util.Iterator;
import java.util.List;

import nuc.ss.shopping.entiy.Book;

public class TestBookDemo {
	public static void main(String[] args) {
		IBookDao bd = new BookDaoImpl();
		String[] bookinfo1 = {"b00001","水浒传","工具","历史","施耐庵","55.0","30"};
		String[] bookinfo2 = {"b00002","西游记","工具","历史","吴承恩","58.0","40"};
		bd.addNewBook(new Book(bookinfo1));
		bd.addNewBook(new Book(bookinfo2));
		
		List<Book> book = bd.queryAllBooks();
		
		Iterator<Book> iter = book.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("################");
		Book b = bd.queryBookById("b00002");
		System.out.println(b);
	}
}

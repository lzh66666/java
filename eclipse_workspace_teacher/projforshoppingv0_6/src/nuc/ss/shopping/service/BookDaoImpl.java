package nuc.ss.shopping.service;

import java.util.ArrayList;
import java.util.List;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;

public class BookDaoImpl implements BookDao{
	/** 书籍数据集（包含书籍的相关测试数据） */
	private BookDataSet bds = null;
	
	public BookDaoImpl() {
		bds = new BookDataSet();
	}
	
	/**
	 * 查询所有的书籍信息
	 * 
	 * @return 所有的书籍信息
	 */
	public Book[] queryAllBooks() {
		return bds.getBooks();
	}

	/**
	 * 根据书籍编号查询书籍的详细信息
	 * 
	 * @param id 用户输入的书籍编号
	 * @return 书籍的详细信息
	 */
	public Book queryBookById(String id){
		// 索取所有的书籍信息
		Book[] books = bds.getBooks();
		
		// 遍历所有的书籍信息
		for (Book book : books) {
			if (book.getBid().equals(id))
				return book;
		}

		// 没有找到任何书籍信息
		return null;
	}

	/**
	 * 按用户输入的条件，检索满足条件的书籍信息:<br>
	 * 1.用户没有输入任何条件，检索所有书籍。<br>
	 * 2.用户输入name,模糊查询(like)满足书名条件的书籍信息。<br>
	 * 3.用户输入分类编号，查询满足分类的书籍信息。<br>
	 * 4.用户输入两个条件，则需要查询出既满足书名又满足分类的书籍信息。<br>
	 * 
	 * @param name 用户输入的书籍名称查询条件
	 * @param category	用户选择的书籍分类
	 * @return 满足条件的书籍信息，如果没有书籍满足条件则返回NULL。
	 */
	@Override
	public List<Book> queryBook(String name) {
		List<Book> books = new ArrayList<Book>();
		
		Book[] bookArray = queryAllBooks();
		
		for (int i = 0; i < bookArray.length; i++) {
			books.add(bookArray[i]);
		}
		
		return books;
	}


	
}

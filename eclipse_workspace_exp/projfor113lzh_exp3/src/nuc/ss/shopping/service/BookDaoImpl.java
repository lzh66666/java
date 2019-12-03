package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;

/**
 * 
 * 书籍处理业务类，业务类主要的作用是基于测试数据的书籍查询、购买、删除、显示功能
 * 
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8（建议）
 */
public class BookDaoImpl implements BookDao{

	/** 书籍数据集（包含书籍的相关测试数据） */
	private BookDataSet bds = null;
	
	public BookDaoImpl() {
		bds = new BookDataSet();
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

		// 没有找到任何书籍信息抛出异常
		return null;
	}
	

	/**
	 * 查询所有的书籍信息
	 * 
	 * @return 所有的书籍信息
	 */
	public Book[] queryAllBooks() {
		return bds.getBooks();
	}

}

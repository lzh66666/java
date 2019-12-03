package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;
import nuc.ss.shopping.exception.CartyException;

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

	@Override
	public boolean buy(String bid, int number) throws CartyException {
		Book book = queryBookById(bid);
		if (book == null) 
			return false;
		if (book.getNumber() < number )
			throw new CartyException();
		
		book.setNumber(book.getNumber() - number);
		return true;
	}
	
}

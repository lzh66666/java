package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;

public interface BookDao {
	/**
	 * 根据书籍编号查询书籍的详细信息
	 * 
	 * @param id 用户输入的书籍编号
	 * @return 书籍的详细信息
	 */
	public Book queryBook(String id);
	
	/**
	 * 查询所有的书籍信息
	 * 
	 * @return 所有的书籍信息
	 */
	public Book[] queryBook();
}

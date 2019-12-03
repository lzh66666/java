package projfor_c113_lzh.shopping.service;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh_shoping.CartyException.CartyException;

public interface BookDao {
	/**
	 * 根据书籍编号查询书籍的详细信息
	 * 
	 * @param id 用户输入的书籍编号
	 * @return 书籍的详细信息
	 */
	public Book queryBookById(String id);
	
	/**
	 * 查询所有的书籍信息
	 * 
	 * @return 所有的书籍信息
	 */
	public Book[] queryAllBooks();
	/**
	 * 用户购买书籍
	 * 
	 * @param bid 用户输入的书籍编号
	 * @param number 用户输入的书籍数量
	 * @return 如果书籍库存足够,书籍编号存在,返回true,否则返回false
	 * @throws CartyException
	 */
	public boolean buy(String bid,  int number) throws CartyException;
}

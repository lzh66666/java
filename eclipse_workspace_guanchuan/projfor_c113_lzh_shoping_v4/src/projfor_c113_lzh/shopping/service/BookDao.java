package projfor_c113_lzh.shopping.service;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh_shoping.CartyException.CartyException;

public interface BookDao {
	/**
	 * �����鼮��Ų�ѯ�鼮����ϸ��Ϣ
	 * 
	 * @param id �û�������鼮���
	 * @return �鼮����ϸ��Ϣ
	 */
	public Book queryBookById(String id);
	
	/**
	 * ��ѯ���е��鼮��Ϣ
	 * 
	 * @return ���е��鼮��Ϣ
	 */
	public Book[] queryAllBooks();
	/**
	 * �û������鼮
	 * 
	 * @param bid �û�������鼮���
	 * @param number �û�������鼮����
	 * @return ����鼮����㹻,�鼮��Ŵ���,����true,���򷵻�false
	 * @throws CartyException
	 */
	public boolean buy(String bid,  int number) throws CartyException;
}

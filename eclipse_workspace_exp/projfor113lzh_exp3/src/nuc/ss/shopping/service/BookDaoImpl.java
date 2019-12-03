package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;

/**
 * 
 * �鼮����ҵ���࣬ҵ������Ҫ�������ǻ��ڲ������ݵ��鼮��ѯ������ɾ������ʾ����
 * 
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class BookDaoImpl implements BookDao{

	/** �鼮���ݼ��������鼮����ز������ݣ� */
	private BookDataSet bds = null;
	
	public BookDaoImpl() {
		bds = new BookDataSet();
	}

	/**
	 * �����鼮��Ų�ѯ�鼮����ϸ��Ϣ
	 * 
	 * @param id �û�������鼮���
	 * @return �鼮����ϸ��Ϣ
	 */
	public Book queryBookById(String id){
		// ��ȡ���е��鼮��Ϣ
		Book[] books = bds.getBooks();
		
		// �������е��鼮��Ϣ
		for (Book book : books) {
			if (book.getBid().equals(id))
				return book;
		}

		// û���ҵ��κ��鼮��Ϣ�׳��쳣
		return null;
	}
	

	/**
	 * ��ѯ���е��鼮��Ϣ
	 * 
	 * @return ���е��鼮��Ϣ
	 */
	public Book[] queryAllBooks() {
		return bds.getBooks();
	}

}

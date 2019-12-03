package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;
import nuc.ss.shopping.exception.CartyException;

public class BookDaoImpl implements BookDao{
	/** �鼮���ݼ��������鼮����ز������ݣ� */
	private BookDataSet bds = null;
	
	public BookDaoImpl() {
		bds = new BookDataSet();
	}
	
	/**
	 * ��ѯ���е��鼮��Ϣ
	 * 
	 * @return ���е��鼮��Ϣ
	 */
	public Book[] queryAllBooks() {
		return bds.getBooks();
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

		// û���ҵ��κ��鼮��Ϣ
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

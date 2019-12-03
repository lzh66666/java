package nuc.ss.shopping.service;

import java.util.ArrayList;
import java.util.List;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.BookDataSet;

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

	/**
	 * ���û���������������������������鼮��Ϣ:<br>
	 * 1.�û�û�������κ����������������鼮��<br>
	 * 2.�û�����name,ģ����ѯ(like)���������������鼮��Ϣ��<br>
	 * 3.�û���������ţ���ѯ���������鼮��Ϣ��<br>
	 * 4.�û�������������������Ҫ��ѯ�����������������������鼮��Ϣ��<br>
	 * 
	 * @param name �û�������鼮���Ʋ�ѯ����
	 * @param category	�û�ѡ����鼮����
	 * @return �����������鼮��Ϣ�����û���鼮���������򷵻�NULL��
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
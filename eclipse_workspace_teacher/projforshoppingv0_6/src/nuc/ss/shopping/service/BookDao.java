package nuc.ss.shopping.service;

import java.util.List;

import nuc.ss.shopping.entity.Book;

public interface BookDao {
	/**
	 * ��ѯ���е��鼮��Ϣ
	 * 
	 * @return ���е��鼮��Ϣ
	 */
	public Book[] queryAllBooks();
	
	/**
	 * �����鼮��Ų�ѯ�鼮����ϸ��Ϣ
	 * 
	 * @param id �û�������鼮���
	 * @return �鼮����ϸ��Ϣ
	 */
	public Book queryBookById(String id);
	
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
	public List<Book> queryBook(String name);
	
}
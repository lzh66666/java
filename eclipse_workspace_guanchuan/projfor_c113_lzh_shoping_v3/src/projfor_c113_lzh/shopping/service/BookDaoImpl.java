package projfor_c113_lzh.shopping.service;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.entity.BookDataSet;
import projfor_c113_lzh_shoping.CartyException.CartyException;

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
	
	/**
	 * �û������鼮
	 * 
	 * @param bid �û�������鼮���
	 * @param number �û�������鼮����
	 * @return ����鼮����㹻,�鼮��Ŵ���,����true,���򷵻�false
	 * @throws CartyException
	 */
	@Override
	public boolean buy(String bid, int number) throws CartyException {
		Book[] books = bds.getBooks();
		boolean judgeId = false;
		boolean judgeNum = false;
		for (Book book : books) {
			if(book.getBid().equals(bid)) {
				judgeId = true;
				if(book.getNumber() >= number) {
					judgeNum = true;
					book.setNumber(book.getNumber()-number);
				}
				break;
			}
		}
		if(judgeId && judgeNum) {
			return true;
		}else if(judgeId && !judgeNum){
			throw new CartyException("��Ҫ�������Ʒ�������㣡");
		}else {
			throw new CartyException("û����Ҫ�����������Ʒ��");
		}
	}

}

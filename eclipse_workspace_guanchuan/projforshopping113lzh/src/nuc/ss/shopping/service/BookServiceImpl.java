package nuc.ss.shopping.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nuc.ss.shopping.dao.BookDaoImpl;
import nuc.ss.shopping.dao.IBookDao;
import nuc.ss.shopping.entiy.Book;

public class BookServiceImpl implements IBookService{
	private IBookDao bDao = new BookDaoImpl();
	@Override
	public String addBook(Book book) {
		if(bookIdIsValid(book.getBid())) {
			if(!bookNumIsNumber(book.getNum())) {
				return "�鼮�������������";
			}
			if(!bookPriceIsNumber(book.getPrice())) {
				return "�۸�����ĸ�ʽ����";
			}
			List<Book> books = bDao.queryAllBooks();
			for (int i = 0; i < books.size(); i++) {
				if(books.get(i).getBid().equals(book.getBid())) {
					bDao.addOldBook(book);
					return "���������鼮" + book.getName() + book.getNum() + "��";
				}
			}
			bDao.addNewBook(book);
			return "��������" + book.getName() + book.getNum() + "��";
		}else {
			return "�鼮��Ŵ���,��ű�����b��ͷ,5λ����";
		}
	}
	
	private boolean bookIdIsValid(String id) {
		Pattern p = Pattern.compile("^[b]\\d{5}$");
		Matcher m = p.matcher(id);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean bookNumIsNumber(String num) {
		Pattern p = Pattern.compile("^[1-9]\\d*$");
		Matcher m = p.matcher(num);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	private boolean bookPriceIsNumber(String price) {
		Pattern p = Pattern.compile("^[0-9]+(.[0-9]{1,2})?$");
		Matcher m = p.matcher(price);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	

}
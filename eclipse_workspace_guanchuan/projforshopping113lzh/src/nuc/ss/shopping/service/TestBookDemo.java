package nuc.ss.shopping.service;

import nuc.ss.shopping.entiy.Book;

public class TestBookDemo {
	public static void main(String[] args) {
		IBookService bs = new BookServiceImpl();
		
		String[] bookinfo = {"b00003","��¥��","������","��ʷ��","��ѩ��","50.0","45"};
		
		Book book = new Book(bookinfo);
		String nbook = bs.addBook(book);
		
		System.out.println(nbook);
	}
}
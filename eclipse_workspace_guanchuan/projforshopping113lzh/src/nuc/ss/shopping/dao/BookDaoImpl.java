package nuc.ss.shopping.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nuc.ss.shopping.db.DatabaseConfig;
import nuc.ss.shopping.entiy.Book;

public class BookDaoImpl implements IBookDao{
	@Override
	public List<Book> queryAllBooks() {
		List<Book> books = new ArrayList<Book>();
		File f = new File(DatabaseConfig.BOOK_FILE_PATH);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String str;
			String [] bookInfo;
			Book book;
			while((str = br.readLine()) != null) {
				bookInfo = str.split("ح");
				book = new Book(bookInfo);
				books.add(book);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return books;
	}

	@Override
	public Book queryBookById(String id) {
		List<Book> books = queryAllBooks();
		Book book = null;
		Iterator<Book> iter = books.iterator();
		while(iter.hasNext()) {
			book = iter.next();
			if(book.getBid().equals(id)) {
				return book;
			}
		}
		return null;
	}

	@Override
	public void addNewBook(Book book) {
		File f = new File(DatabaseConfig.BOOK_FILE_PATH);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f,true);
			bw = new BufferedWriter(fw);
			bw.write(book.toString());
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void addOldBook(Book book) {
		File f = new File(DatabaseConfig.BOOK_FILE_PATH);
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuffer buff = new StringBuffer();
		
		
		try {
			br = new BufferedReader(new FileReader(f));
			for (String str = br.readLine(); str != null; str = br.readLine()) {
				String [] strr = str.split("ح");
				if (strr[0].equals(book.getBid())) {
					buff.append(strr[0] + "ح" + strr[1] + "ح" + strr[2] + "ح" + 
							strr[3] + "ح" + strr[4] + "ح" + strr[5] + "ح");
					int num = Integer.parseInt(strr[6]);
					int b = Integer.parseInt(book.getNum());
					String s = (num+b) + "";
					strr[6] = s;
					buff.append(strr[6] + "\r\n");
				}else {
					buff.append(strr[0] + "ح" + strr[1] + "ح" + strr[2] + "ح" + 
							strr[3] + "ح" + strr[4] + "ح" + strr[5] + "ح" + strr[6] 
									+ "\r\n");
				}
				
			}
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(buff.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

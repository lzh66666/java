package cn.campsg.gm.entit;
/**
 * վ����Ʒ����
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args) {
		BookDataSet bookDataSet = new BookDataSet();
		Book[] book = bookDataSet.getBooks();
		
		System.out.println("վ����Ʒ��ϸ:");
		
		for (Book book2 : book) {
			System.out.println(book2);
		}
		
	}
}

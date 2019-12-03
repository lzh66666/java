package cn.campsg.gm.entit;
/**
 * 站点商品测试
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args) {
		BookDataSet bookDataSet = new BookDataSet();
		Book[] book = bookDataSet.getBooks();
		
		System.out.println("站点商品明细:");
		
		for (Book book2 : book) {
			System.out.println(book2);
		}
		
	}
}

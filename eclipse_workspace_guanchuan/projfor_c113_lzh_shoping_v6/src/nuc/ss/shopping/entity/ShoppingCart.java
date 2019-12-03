package nuc.ss.shopping.entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import nuc.ss.shopping.exception.CartyException;

public class ShoppingCart extends HashMap<Book, Integer> {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 将商品放入购物车
	 *
	 * @param book 书籍对象
	 * @param quantity 购买的数量
	 * @exception 购买数量超过实际库存    
	 */
	public void buy(Book book, Integer quantity) throws CartyException{
		// 判断是否满足用户的购买需求，若不满足，则抛出CartyException异常，给用户显示相关提示信息。
		if(quantity > book.getNumber()) {
			throw new CartyException("书籍: <<" + book.getName() + ">>库存不足,仅剩" + book.getNumber() + "本");
		}
		// 判断用户是否已经购买了当前书籍，并对购物车中的信息做相应处理
		Integer num = get(book);
		if(num == null) {
			num = quantity;
			System.out.println("购买新书" + book.getName() + "成功");
		}else {
			num += quantity;
			System.out.println("已有该书籍" + book.getName() +",又向其中添加了" + quantity + "本");
		}
		
		// 更新用户购物车信息
		put(book, num);
		// 减去库存
		book.setNumber((book.getNumber()-quantity));
		
	}
	/**
	 * 将商品从购物车中删除 
	 * 
	 * @param book 书籍对象
	 * @exception 传入的书籍在购物车中不存在
	 */
	public void remove(Book book) throws CartyException{
		// 判断传入的书籍在购物车中是否存在
		Integer num = get(book);
		if(num == null) {
			throw new CartyException("购物车里面没有书籍: " + book.getName());
		}
		// 从购物车中删除指定书籍
		super.remove(book);
		// 加入库存
		book.setNumber((book.getNumber()+num));
		System.out.println("书籍: " + book.getName() + "已经从购物车中移除");
	}
	
	// 显示购物车内容
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("");
		Set<Book> keys = super.keySet();
		Iterator<Book> looper = keys.iterator();
		
		// 循环显示购物车中用户购买的书籍
		while(looper.hasNext()) {
			Book book = looper.next();
			buffer.append(book + " 购买了：" + super.get(book) + "件\r\n");
		}
		
		return buffer.toString();
	}
	
}

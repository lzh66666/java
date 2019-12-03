package nuc.ss.shopping.entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import nuc.ss.shopping.exception.CartyException;

public class ShoppingCart extends HashMap<Book, Integer> {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * ����Ʒ���빺�ﳵ
	 *
	 * @param book �鼮����
	 * @param quantity ���������
	 * @exception ������������ʵ�ʿ��    
	 */
	public void buy(Book book, Integer quantity) throws CartyException{
		// ��ȡ�û�Ҫ������鼮�Ŀ����
		
		// �ж��Ƿ������û��Ĺ��������������㣬���׳�CartyException�쳣�����û���ʾ�����ʾ��Ϣ��
		
		// �ж��û��Ƿ��Ѿ������˵�ǰ�鼮�����Թ��ﳵ�е���Ϣ����Ӧ����
		
		// �����û����ﳵ��Ϣ
		
		// ��ȥ���

		
	}
	/**
	 * ����Ʒ�ӹ��ﳵ��ɾ�� 
	 * 
	 * @param book �鼮����
	 * @exception ������鼮�ڹ��ﳵ�в�����
	 */
	public void remove(Book book) throws CartyException{
		// �жϴ�����鼮�ڹ��ﳵ���Ƿ����
		
		// �ӹ��ﳵ��ɾ��ָ���鼮
		
		// ������
		
	}
	
	// ��ʾ���ﳵ����
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer("");
		Set<Book> keys = super.keySet();
		Iterator<Book> looper = keys.iterator();
		
		// ѭ����ʾ���ﳵ���û�������鼮
		while(looper.hasNext()) {
			Book book = looper.next();
			buffer.append(book + " �����ˣ�" + super.get(book) + "��\r\n");
		}
		
		return buffer.toString();
	}
	
}
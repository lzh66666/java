package projfor_c113_lzh.shopping;

import java.util.Scanner;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.service.BookDao;
import projfor_c113_lzh.shopping.service.BookDaoImpl;
import projfor_c113_lzh.shopping.util.ConsoleFrame;

/**
 * 
 * ������Ҫ�������Ǹ�������Ӧ�ó��򣬲����û������˻��Ի�<br>
 * �����û���ѡ��ִ����Ӧ��ҵ����
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class MainClass1 {

	private static Scanner scanner = new Scanner(System.in);
	
	// ��ȡ�鼮�������
	private static BookDao bookDao = new BookDaoImpl();
	
	public static void main(String[] args) {

		while (true) {
			// ��ʾ�˵�
			ConsoleFrame.showMenu();
			// ����ȡ�û���ѡ��Ӧ�ò������˳�Ӧ�õı����ʼ����ʾ�˵���
			int choise = ConsoleFrame.getChoise();
			switch (choise) {
			case 1:// �����ѯ�����鼮��ҵ��
				ConsoleFrame.queryAllBooks(bookDao);
				break;
			case 2:// �����鼮��Ų�ѯ
				ConsoleFrame.queryBookById(bookDao);
				break;
			case 3:// �����鼮�����鼮���뵽�û��Ĺ��ﳵ��
				break;
			case 4:// ɾ���鼮���ӹ��ﳵ��ɾ���鼮��Ϣ
				break;
			case 5:// ��ʾĳ���û����ﳵ�����е��鼮
				break;
			case 6:// �˳���ǰӦ�ó���
				System.exit(0);
				break;
			default:
				System.out.println("����ѡ����ȷ!!��ȷѡ��Ϊ: 1-6");
				continue;
			}
		}

	}

}
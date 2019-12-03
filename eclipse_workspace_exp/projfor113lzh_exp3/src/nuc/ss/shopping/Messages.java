package nuc.ss.shopping;

/**
 * 
 * ��Ϣ�࣬��������Ϣ��������Ϣ����ʾ<br>
 * INFO_ : ��ʾ��Ϣ<br>
 * QUESTION_ : ������Ϣ<br>
 * ERR_ : ������Ϣ<br>
 * WAR_ : ������Ϣ<br>
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class Messages {
	public static final String INFO_MENU = 
			"***********��Ʒ����ϵͳ*************\r\n" + 
			"1.��ѯ������Ʒ\r\n" + 
			"2.������Ʒ��Ų���ͼ��\r\n" + 
			"3.�����鼮\r\n" + 
			"4.ȡ������\r\n" + 
			"5.��ѯ�������\r\n" + 
			"6.�˳�ϵͳ\r\n" + 
			"*****************************************\r\n";
	
	public static final String INFO_ADD_BOOK_SUCCESSFUL = "��Ʒ����ɹ�!";
	public static final String INFO_REMOVE_BOOK_SUCCESSFUL = "��Ʒ�Ѵӹ��ﳵ�Ƴ�!";
	public static final String INFO_INPUT_VALUE = "��ѡ�����:{0}";
	public static final String INFO_INPUT_MESSAGE = "��ѡ���ˣ�";
	
	public static final String QUESTION_CHOISE_MENU = "��ѡ��(1-6):";
	public static final String QUESTION_ENTRY_BOOK_ID = "��������Ʒ�ı��:";
	public static final String QUESTION_ENTRY_PERSON_ID = "�������û��ı��:";
	
	public static final String WAR_CART_EMPTY = "���ﳵ��û���κε���Ʒ��";
	
	public static final String ERR_BOOK_NOT_FOUND = "��Ʒ��Ϣ�����ڣ�";
	public static final String ERR_PERSON_NOT_FOUND = "�û���Ϣ�����ڣ�";
	public static final String ERR_BOOK_NOT_IN_CART="û�п���ɾ������Ʒ��";
	
	/**
	 * ѡ������
	 */
	public static String[] mess = {
			"�����ѯ�����鼮��ҵ��",
			"�����鼮��Ų�ѯ",
			"�����鼮",
			"ɾ���鼮",
			"��ʾ�û����ﳵ�е��鼮",
			"�˳���ǰӦ�ó��򣬲��˳�Ӧ��"
	};
	
	
	/**
	 * ���Ʋ˵�
	 */
	public static void drawMenu() {
		draw(INFO_MENU);
	}
	
	/**
	 * ���л�����Ϣ
	 * @param msg ��Ҫ���Ƶ���Ϣ
	 */
	public static void drawLine(Object msg) {
		System.out.println(msg);
	}
	
	/**
	 * ������Ϣ
	 * @param msg ��Ҫ���Ƶ���Ϣ
	 */
	public static void draw(Object msg) {
		System.out.print(msg);
	}
	
}
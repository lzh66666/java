package �μ��еİ���.��1_5;
/**
 * ����������
 * @author ¬��
 *
 */
public class TestDemo1_5 {
	static int m_c = 20;
	int m_a = 50;
	int a = 10;
	public static void main(String[] args) {
		int a = 30;
		int m_c = 200;
		System.out.println("�ֲ�����a="+a);
		System.out.println("�ֲ�����m_c="+m_c);
		System.out.println("ȫ�ֱ���m_c="+TestDemo1_5.m_c);
		TestDemo1_5 td = new TestDemo1_5();
		System.out.println("��Ա����m_a="+td.m_a);
		System.out.println("��Ա����a="+td.a);
		System.out.println("ȫԱ����m_c="+td.m_c);
	}
}

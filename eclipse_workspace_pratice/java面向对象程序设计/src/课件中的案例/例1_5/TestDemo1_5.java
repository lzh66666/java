package 课件中的案例.例1_5;
/**
 * 量的作用域
 * @author 卢泽华
 *
 */
public class TestDemo1_5 {
	static int m_c = 20;
	int m_a = 50;
	int a = 10;
	public static void main(String[] args) {
		int a = 30;
		int m_c = 200;
		System.out.println("局部变量a="+a);
		System.out.println("局部变量m_c="+m_c);
		System.out.println("全局变量m_c="+TestDemo1_5.m_c);
		TestDemo1_5 td = new TestDemo1_5();
		System.out.println("成员变量m_a="+td.m_a);
		System.out.println("成员变量a="+td.a);
		System.out.println("全员变量m_c="+td.m_c);
	}
}

package nuc.ss.test.section6_1;

public class OuterClassb{
	private static int m_a;        
	private static int m_b;
	public static void m() {    
		m_b = 60;   
	}
	static class InnerClass{
		private int m_a;
		public void show(){
			m_a = 180;                     // �ڲ���ĳ�Ա
			OuterClassb.m_a = 80;      // �ⲿ��ĳ�Ա
			m();                         // �����ⲿ��ķ���
			m_b++;                       // ���ⲿ���Ա�Ĳ���
			System.out.println("m_a=" + m_a + "; m_b=" + m_b); 
			System.out.println("OuterClass.this.m_a=" + OuterClassb.m_a);
		}
	}
}



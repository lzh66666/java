package nuc.ss.test.section6_1;

public class OuterClass{
	private int m_a;        
	private int m_b;
	public void m() {    
		m_b = 60;   
	}
	class InnerClass{
		private int m_a;
		public void show(){
			m_a = 180;                     // 内部类的成员
			OuterClass.this.m_a = 80;      // 外部类的成员
			m();                         // 调用外部类的方法
			m_b++;                       // 对外部类成员的操作
			System.out.println("m_a=" + m_a + "; m_b=" + m_b); 
			System.out.println("OuterClass.this.m_a=" + OuterClass.this.m_a);
		}
	}
}



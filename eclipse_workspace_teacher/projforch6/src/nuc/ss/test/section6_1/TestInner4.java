package nuc.ss.test.section6_1;

public class TestInner4{
      private static int m_a;  
      private static int m_b;
      public static void m() {    
    	  m_b = 60;   
      }
      static class InnerClass{
            private int m_a;
            public void show(){
                  m_a = 180;                       // �ڲ���ĳ�Ա
                  TestInner4.m_a = 80;             // �ⲿ���static��Ա
                  m();                             // �����ⲿ���static����
                  m_b++;                           // ���ⲿ��static��Ա�Ĳ���
                  System.out.println("m_a=" + m_a + "; m_b=" + m_b); 
                  System.out.println("TestInner4.m_a=" + TestInner4.m_a);
           } 
     }
      public static void main(String[] args) {
              TestInner4.InnerClass innerObject = 
                                         new TestInner4.InnerClass();
               innerObject.show();
      }
}

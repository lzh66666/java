package nuc.ss.test.interfacedemo.message;

interface  ShowMessage {
    void show(String s);
}
class TV implements ShowMessage {
   public void show(String s) { 
		  System.out.println("TV�̱꣺" + s);  
	  }
}
class PC implements ShowMessage {
   public void show(String s) { 
		  System.out.println("PC�̱꣺" + s );  
   }
}
public class TestInterface {
	public static void main(String args[]) {
	   ShowMessage sm;                  //�����ӿڱ���
	   sm=new TV();                          //�ӿڱ����д�Ŷ��������
	   sm.show("�����Ƶ��ӻ�");        //�ӿڻص���
	   sm=new PC();                          //�ӿڱ����д�Ŷ��������
	   sm.show("���뱼��5008PC��"); //�ӿڻص�
	}
}



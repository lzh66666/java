package nuc.ss.test.section7_5;

class IdentityCardNo {
	private static IdentityCardNo instance = null;
	private String no;
	
	private IdentityCardNo() {	
	}
	
	public static IdentityCardNo getInstance() {
		if(instance == null) {
			System.out.println("��һ�ΰ������֤�������º��룡");
		    instance = new IdentityCardNo();
		    instance.setIdentityCardNo("No400011112222");		
		} else {
			System.out.println("�ظ��������֤����ȡ�ɺ��룡");  
		}
		return instance;
	}
	
	private void setIdentityCardNo(String no) {
	    this.no = no;
	}
	
	public String getIdentityCardNo() {
		return this.no;
	}
}

public class TestIdentityCardNo {
	public static void main(String[] args)	{
	   IdentityCardNo no1, no2;
	   no1 = IdentityCardNo.getInstance();
       no2 = IdentityCardNo.getInstance();
       System.out.println("���֤�����Ƿ�һ�£�" + (no1 == no2));
       
       String str1, str2;
       str1 = no1.getIdentityCardNo();
       str2 = no2.getIdentityCardNo();
       System.out.println("��һ�κ��룺" + str1);
       System.out.println("�ڶ��κ��룺" + str2);
       System.out.println("�����Ƿ���ȣ�" + str1.equalsIgnoreCase(str2));
       System.out.println("�Ƿ�����ͬ����" + (str1 == str2));
	}
}


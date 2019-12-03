package ������.����ģʽ.���֤;

public class IdentityCardNo {
	private static IdentityCardNo instance = null;
	private static String no;
	
	private IdentityCardNo(){
	}
	
	public static IdentityCardNo getInstance() {
		if(instance == null) {
			instance = new IdentityCardNo();
			setIdentityCardNo("123456789");
			System.out.println("��һ�ΰ������֤,���֤��Ϊ:"+no);
		}else {
			System.out.println("�������֤,���֤��Ϊ:" + no);
			no = getIdentityCardNo();
		}
		return instance;
	}

	public static String getIdentityCardNo() {
		return no;
	}
 
	public static void setIdentityCardNo(String no) {
		IdentityCardNo.no = no;
	}
	
	public String toString() {
		return no;
	}
}

package 第七章.单例模式.身份证;

public class IdentityCardNo {
	private static IdentityCardNo instance = null;
	private static String no;
	
	private IdentityCardNo(){
	}
	
	public static IdentityCardNo getInstance() {
		if(instance == null) {
			instance = new IdentityCardNo();
			setIdentityCardNo("123456789");
			System.out.println("第一次办理身份证,身份证号为:"+no);
		}else {
			System.out.println("补办身份证,身份证号为:" + no);
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

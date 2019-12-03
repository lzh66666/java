package nuc.ss.test.section7_5;

class IdentityCardNo {
	private static IdentityCardNo instance = null;
	private String no;
	
	private IdentityCardNo() {	
	}
	
	public static IdentityCardNo getInstance() {
		if(instance == null) {
			System.out.println("第一次办理身份证，分配新号码！");
		    instance = new IdentityCardNo();
		    instance.setIdentityCardNo("No400011112222");		
		} else {
			System.out.println("重复办理身份证，获取旧号码！");  
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
       System.out.println("身份证号码是否一致：" + (no1 == no2));
       
       String str1, str2;
       str1 = no1.getIdentityCardNo();
       str2 = no2.getIdentityCardNo();
       System.out.println("第一次号码：" + str1);
       System.out.println("第二次号码：" + str2);
       System.out.println("内容是否相等：" + str1.equalsIgnoreCase(str2));
       System.out.println("是否是相同对象：" + (str1 == str2));
	}
}


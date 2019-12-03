package 第七章.单例模式.身份证;

public class TestCardNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityCardNo no = IdentityCardNo.getInstance();
		IdentityCardNo no1 = IdentityCardNo.getInstance();
		IdentityCardNo no2 = IdentityCardNo.getInstance();
		System.out.println(no == no1);
		System.out.println(no == no2);
	}
}

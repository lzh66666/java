package �α��ϵİ���.��2_2;
/**
 * �Ƚ������ʵ��
 * @author ·��
 *
 */
public class Operators {
	public static void main(String[] args) {
		short aa = 10,cc = 23;
		boolean bb = aa>cc;
		System.out.println("aa>cc?"+bb);
		
		String st1 = new String("how are you");
		String st2 = new String("how are you");
//		�Ƚ�st1��st2�Ƿ�Ϊͬһ���������
		if(st1 == st2) {
			System.out.println("st1==st2 ?"+true);
		}
		else {
			System.out.println("st1==st2 ?"+false);
		}
	}
}

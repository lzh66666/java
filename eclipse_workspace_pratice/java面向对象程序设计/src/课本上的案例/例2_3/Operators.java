package �α��ϵİ���.��2_3;
/**
 * ��������ʵ��
 * @author ¬��
 *
 */
public class Operators {
	public static void main(String[] args) {
		int val;
		val = Integer.parseInt(args[0]);
		if(val != 0 && 1.0/val < Double.MAX_VALUE) {
			System.out.println("val�ĵ���Ϊ:"+1.0/val);
		}
		else {
			System.out.println("val�ĵ���Ϊ�����");
		}
	}
}

package �μ��еİ���.��2_7;
/**
 * ���50�������е�����
 * @author ¬��
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int i,j;
		for (j = 2; j <= 50; j++) {
			for(i = 2; i <= j/2; i++) {
				if(j%i == 0) {
					break;
				}
			}
			if(i > j/2) {
				System.out.println(j+"������!");
			}
		}
	}
}

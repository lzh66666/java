/**
 * ����Ƕ��ѭ��
 * @author ¬��
 *
 */
public class TestWhileQianTao {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("####################");
		//��whileѭ���ֱ����100���ڵ�������ż���ĺͣ������
		int sum01=0;
		int sum02=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum01+=i;
			}else {
				sum02+=i;
			}
		}
		System.out.println("�����ͣ�"+sum01);
		System.out.println("ż���ͣ�"+sum02);
		
		System.out.println("####################");
		int count=0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
				System.out.print(i+"\t");
				count++;
			}
			if(count==5) {
				System.out.println();
				count=0;
			}
		}
	}
}

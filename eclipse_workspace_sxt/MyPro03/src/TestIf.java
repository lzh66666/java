/**
 * ����if���
 * @author ¬��
 *
 */
public class TestIf {
	public static void main(String[] args) {
//		double d=Math.random();
//		System.out.println(d);//����[0,1)֮��������
//		System.out.println((int)(6*Math.random()+1));
		int i=(int)(6*Math.random()+1);
		int j=(int)(6*Math.random()+1);
		int k=(int)(6*Math.random()+1);
		
		int count=i+j+k;
		if(count>15) {
			System.out.println("������������");
		}
		if(count>=10&&count<=15) {
			System.out.println("��������һ��");
		}
		if(count<10) {
			System.out.println("������������ô��!");
		}
		System.out.println("����"+count+"��");
	}
}

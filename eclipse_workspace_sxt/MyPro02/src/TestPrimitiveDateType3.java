/**
 * �����ַ����ͺͲ�������
 * @author ¬��
 *
 */
public class TestPrimitiveDateType3 {
	public static void main(String[] agrs) {
		char a='T';
		char b='��';
		char c='\u0061';
		System.out.println(c);
		
		//ת���ַ�
		System.out.println('a'+'b');
		System.out.println(""+'a'+'b');
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');//a'b
		
		//String��һ���ַ�����
		String d="abc";
		//���Բ�������
		boolean man=true;
		if(man) {
			System.out.println("����");
		}
	}
}

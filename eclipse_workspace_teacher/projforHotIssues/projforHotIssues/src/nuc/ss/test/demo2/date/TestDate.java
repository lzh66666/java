package nuc.ss.test.demo2.date;

/**
 * ������ʾ������java.util.Date�Ļ����÷�
 * @author dell
 *
 */
public class TestDate {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date(); // ʹ��Date���е��޲ι��췽��Ϊ��ǰ�����ں�ʱ�䴴��һ��Dateʵ��
		System.out.println("��GMTʱ��1970��1��1������������ȥ��ʱ�䣨����������" + date.getTime()); //GMT: Ӣ����������ʱ�䣨�������׼ʱ�䣩
		System.out.println(date); // �� 	System.out.println(date.toString());
		
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		String current = sdf.format(date);
		System.out.println(current);
	}

}

/**
 *  ��Ͷ���
 * @author ¬��
 *
 */
public class Student {
	//ֻ�������ǽṹ��
	//����
	int id;
	String name;
	int age;
	
	Computer comp;//�����
	
	//����
	void study() {
		System.out.println("��������ѧϰ����ʹ�õ��ԣ�"+comp.brand);
	}
	
	void play() {
		System.out.println("��������Ϸ��������ҫ��");
	}
	
	//���췽�����������ڴ��������Ķ���,�޲εķ���������ϵͳ�Զ�����
	Student(){
	}
	
	//����ִ����ڣ�����Ҫ��
	public static void main(String[] args) {
		Student stu=new Student();//����һ������
		stu.play();
		stu.id=1001;
		stu.name="¬��";
		stu.age=22;
		
		Computer c1=new Computer();
		c1.brand="����";
		
		stu.comp=c1;
		
		stu.play();
		stu.study();
	}
}
class Computer{
	String brand;
}

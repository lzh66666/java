package nuc.ss.test.section9_9xhl;

public class TestLamda {	
	public static void test(MyInterface myInterface){
        int result = myInterface.lMethod(3, 9);//���ò�������,���շ��ز���
        System.out.println(result);
    }
	public static void main(String[] args) {
		TalkShow talkshow = new TalkShow();
		talkshow.talkShow(new Doctor());//��ҽ���ʹ�ҽ�̸
		System.out.println("*******ʹ�������ڲ���������********");
		talkshow.talkShow(new Talk(){
			@Override
			public void talk(){
				System.out.println("��Һã����������ߣ�");
			}
		});   //�����������ʹ�ҽ�̸����ʽ���ӣ��������ܱ���û��
		
		//��Lamda���ʽ�滻������1��() ->������䣻
		System.out.println("*******Lamda����������********");
		talkshow.talkShow(()->System.out.println("��Һã�����Lamda�����ߣ�"));
		//2��() ->{�������}��
		System.out.println("*******Lamda����������********");
		talkshow.talkShow(()->{
			System.out.println("��Һã�����Lamda�����ߣ�");
			System.out.println("���Ƕ�����Ϣ��");
			});	
		
		//3��() ->���ʽ��
		System.out.println("*******Lamda���ʽ����********");
		test((x,y)-> x * y );//���÷���
	}

}

interface Talk{
    void talk();
}
//����ҽ���࣬���кͱ��˽�̸�Ĺ���
class Doctor implements Talk{
	@Override
	public void talk(){
		System.out.println("��Һã�����ҽ����");
	}
}
//̸���������talkShow�����ô��ݵĶ���ʹ�ҽ�̸
class TalkShow{
	public void talkShow(Talk talker){
		talker.talk();
	}
}
interface MyInterface{
    int lMethod(int a, int b);
}


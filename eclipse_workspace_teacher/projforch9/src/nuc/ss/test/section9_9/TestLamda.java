package nuc.ss.test.section9_9;

public class TestLamda {	
	public static void test(MyInterface myInterface){
        int result=myInterface.lMethod(1,2);//���ò�������,���շ��ز���
        System.out.println(result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalkShow talkshow=new TalkShow();
		talkshow.talkShow(new Doctor());//��ҽ���ʹ�ҽ�̸
		talkshow.talkShow(new Talk(){
			@Override
			public void talk(){
				System.out.println("��Һã����������ߣ�");
			}
		});   //�����������ʹ�ҽ�̸����ʽ���ӣ��������ܱ���û��
		
		//��Lamda����ʽ�滻������1��() ->������䣻
		talkshow.talkShow(()->System.out.println("��Һã�����Lamda�����ߣ�"));
		//2��() ->{�������}��
		System.out.println("*******Lamda����������********");
		talkshow.talkShow(()->{
			System.out.println("��Һã�����Lamda�����ߣ�");
			System.out.println("���Ƕ�����Ϣ��");
			});	
		
		//3��() ->����ʽ��
		test((x,y)-> x*y );//���÷���
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
	public void  talkShow(Talk talker){
		talker.talk();
	}
}
interface MyInterface{
    int lMethod(int a,int b);
}

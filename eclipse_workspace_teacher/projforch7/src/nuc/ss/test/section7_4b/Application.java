package nuc.ss.test.section7_4b;

//��������ģʽ
public class Application {
	public static void main(String args[]) {
		PenCore penCore;   //��о
		PenCoreCreator creator;    //��о������ 
		BallPen ballPen = new BallPen(); //Բ���
		
		creator = new RedCoreCreator();
		penCore = creator.getPenCore(); //ʹ�ù����������ر�о
		ballPen.usePenCore(penCore);
		ballPen.write("���,�ܸ�����ʶ��");
		
		creator = new BlueCoreCreator();
		penCore = creator.getPenCore(); 
		ballPen.usePenCore(penCore);
		ballPen.write("nice to meet you");
		
		creator = new BlackCoreCreator();
		penCore = creator.getPenCore(); 
		ballPen.usePenCore(penCore);
		ballPen.write("how are you");
	}
}

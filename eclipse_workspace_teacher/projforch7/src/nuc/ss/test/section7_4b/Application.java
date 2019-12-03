package nuc.ss.test.section7_4b;

//工厂方法模式
public class Application {
	public static void main(String args[]) {
		PenCore penCore;   //笔芯
		PenCoreCreator creator;    //笔芯构造者 
		BallPen ballPen = new BallPen(); //圆珠笔
		
		creator = new RedCoreCreator();
		penCore = creator.getPenCore(); //使用工厂方法返回笔芯
		ballPen.usePenCore(penCore);
		ballPen.write("你好,很高兴认识你");
		
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

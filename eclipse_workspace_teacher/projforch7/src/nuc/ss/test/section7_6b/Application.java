package nuc.ss.test.section7_6b;

//����ģʽ
public class Application {
	public static void main(String args[]){
		Person zhang=new Person();
		zhang.setName("����");
		double[] a = {9.12, 9.25, 8.87, 9.99, 6.99, 7.88};
	     
		AverageScore game = new AverageScore();//�����Ķ���game
	     
		game.setStrategy(new StrategyA());   //�����Ķ���ʹ�þ������
		double aver = game.getAverage(a);    //�����Ķ���õ�ƽ��ֵ   
		zhang.setScore(aver);
		System.out.println("�㷨A:");
		System.out.printf("%s���÷�:%5.3f%n", zhang.getName(), zhang.getScore());
	     
		game.setStrategy(new StrategyB());   
		aver = game.getAverage(a);          //�����Ķ���õ�ƽ��ֵ   
		zhang.setScore(aver);
		System.out.println("�㷨B:");
		System.out.printf("%s���÷�:%5.3f%n", zhang.getName(), zhang.getScore());  
	}
}

class Person {
	private String name;
	private double score;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
}
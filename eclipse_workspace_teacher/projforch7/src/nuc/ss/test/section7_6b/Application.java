package nuc.ss.test.section7_6b;

//策略模式
public class Application {
	public static void main(String args[]){
		Person zhang=new Person();
		zhang.setName("张三");
		double[] a = {9.12, 9.25, 8.87, 9.99, 6.99, 7.88};
	     
		AverageScore game = new AverageScore();//上下文对象game
	     
		game.setStrategy(new StrategyA());   //上下文对象使用具体策略
		double aver = game.getAverage(a);    //上下文对象得到平均值   
		zhang.setScore(aver);
		System.out.println("算法A:");
		System.out.printf("%s最后得分:%5.3f%n", zhang.getName(), zhang.getScore());
	     
		game.setStrategy(new StrategyB());   
		aver = game.getAverage(a);          //上下文对象得到平均值   
		zhang.setScore(aver);
		System.out.println("算法B:");
		System.out.printf("%s最后得分:%5.3f%n", zhang.getName(), zhang.getScore());  
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
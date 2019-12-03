package nuc.ss.test.section7_6b;

//上下文（Context）
public class AverageScore {
    Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public double getAverage (double[] a) {
       if(strategy != null)
    	   return strategy.computerAverage(a); 
       else {
    	   System.out.println("没有求平均值的算法,得到的-1不代表平均值");
    	   return -1;
       }
   }
}

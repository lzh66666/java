package nuc.ss.test.section7_6b;

//�����ģ�Context��
public class AverageScore {
    Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public double getAverage (double[] a) {
       if(strategy != null)
    	   return strategy.computerAverage(a); 
       else {
    	   System.out.println("û����ƽ��ֵ���㷨,�õ���-1������ƽ��ֵ");
    	   return -1;
       }
   }
}

package nuc.ss.test.section7_6b;

//¾ßÌå²ßÂÔA
public class StrategyA implements Strategy{
    public double computerAverage(double[] a){
        double score = 0, sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        score = sum / a.length;
        return score; 
    }
}
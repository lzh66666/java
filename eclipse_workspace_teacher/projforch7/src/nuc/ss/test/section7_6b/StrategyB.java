package nuc.ss.test.section7_6b;

import java.util.Arrays;

//具体策略B
public class StrategyB implements Strategy{
    public double computerAverage(double [] a){
        if(a.length <= 2)
            return 0;
        double score = 0, sum = 0;
        Arrays.sort(a);   //排序数组
        for(int i = 1; i < a.length-1; i++){
           sum=sum + a[i]; 
        }
        score = sum / (a.length - 2);
        return score; 
    }
}


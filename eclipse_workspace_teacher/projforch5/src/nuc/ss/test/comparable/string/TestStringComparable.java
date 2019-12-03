package nuc.ss.test.comparable.string;

import java.util.Arrays;
public class TestStringComparable{
     public static void main(String[] args){
          String[]  strings = new String []{"ruler", "rubber", "pen",  
                               "pencil", "book", "ink", "globe"};
                   // 其中： new String []可以省略。
          Arrays.sort(strings);  //按字典序排序
          for(String str: strings){
                   System.out.println(str);
           }
    }   
}

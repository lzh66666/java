package nuc.ss.test.comparable.string;

import java.util.Arrays;
public class TestStringComparable{
     public static void main(String[] args){
          String[]  strings = new String []{"ruler", "rubber", "pen",  
                               "pencil", "book", "ink", "globe"};
                   // ���У� new String []����ʡ�ԡ�
          Arrays.sort(strings);  //���ֵ�������
          for(String str: strings){
                   System.out.println(str);
           }
    }   
}

package nuc.ss.test.jdkinterfacedemo.comparable;

import java.util.Arrays;

public class TestStringSort {
     public static void main(String[] args){
          String[]  strings = new String []{"ruler", "rubber", "pen",  
                               "pencil", "book", "ink", "globe"};
                   // new String []¿ÉÒÔÊ¡ÂÔ¡£
          Arrays.sort(strings);  //°´×ÖµäĞòÅÅĞò£¨ÉıĞò£©
          for(String str: strings){
                   System.out.println(str);
           }
    }   
}

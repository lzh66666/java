package cn.lu01;
import java.util.Arrays;
import java.util.Date;



public class Test {
	public static void main(String[] args) {
		System.out.printf("|%,.2f|",10000.0/3);
		System.out.println();
		System.out.printf("%tr",new Date());
		System.out.println();
		System.out.printf("%1$s %2$tB %2$te,%2$tY","Due date:",new Date());
		System.out.println();
		System.out.printf("%s %tB %<te,%<tY","Due data:",new Date());
		int[] a= {2,3,5,7,8,9};
		System.out.println(Arrays.toString(a));
	}
}

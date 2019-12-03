package nuc.ss.book;

import java.util.Scanner;

/**
 * 尺寸转换
 * @author 卢泽华
 * @version 6.1 2019 10 31 22:00
 *
 */

public class Size {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一组(5个)你需要的长度(以尺为单位,以空格隔开):");
		double [] a = new double[5];
		double [] b = new double[5];
		
		boolean judg = false;
		
		while(!judg) {
			try {
				for (int i = 0; i < a.length; i++) {
					b[i] = Double.parseDouble(sc.next());
					a[i] = judge(b[i]);
				}
				for (int i = 0; i < a.length; i++) {
					System.out.println(b[i] + "尺" + " = " + a[i] + "米");
				}
				judg = true;
			}catch (NumberFormatException e) {
				System.out.println("该组尺寸中有的不是数字类型,请重新输入");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("计算结束");
	}
	
	public static double judge(double size) throws Exception{
		if(size < 0) {
			throw new Exception("输入的尺寸有小于零的,请重新输入!!");
		}
		double size1 = size / 3;
		return size1;
	}

}

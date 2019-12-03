package nuc.ss.book;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 错误示例
 * @author 卢泽华
 * @version 6.2 2019 10 31 21:40
 *
 */

public class Size2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个你需要的长度(以尺为单位):");
		
		boolean judg = false;
		
		//此种方法会陷入死循环,如果输入按下面的格式
		while(!judg) {
			try {
				double size = sc.nextDouble();
				double size2 = judge(size);
				System.out.println(size + "尺" + " = " + size2 + "米");
				judg = true;
			}catch (InputMismatchException e) {
				System.out.println("该数不是数字类型,请重新输入");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("计算结束");
	}
	
	public static double judge(double size) throws Exception{
		if(size < 0) {
			throw new Exception("输入的尺寸小于零,请重新输入!!");
		}
		double size1 = size / 3;
		return size1;
	}

}

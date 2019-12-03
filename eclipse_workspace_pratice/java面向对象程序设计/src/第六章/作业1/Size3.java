package 第六章.作业1;

import java.util.Scanner;
/**
 * 尺寸转换
 * @author 卢泽华
 * @version 6.3 2019 11 1 17:30
 *
 */
public class Size3 {
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
			}catch (MyException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println("该组尺寸中有的不是数字类型,请重新输入");
			}
		}
		
		sc.close();
		System.out.println("计算结束");
	}
	
	public static double judge(double size) throws MyException{
		if(size < 0) {
			throw new MyException("输入的尺寸有小于零的,请重新输入!!");
		}
		double size1 = size / 3;
		return size1;
	}

}

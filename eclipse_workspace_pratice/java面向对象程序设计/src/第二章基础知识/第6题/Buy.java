package 第二章基础知识.第6题;

import java.util.Scanner;

public class Buy {
	public static void main(String[] args) {
		Buy buy = new Buy();
		buy.menu();
		String[] vend = {"个口香糖","个巧克力","桶爆米花","杯果汁"};
		int[] count = {0,0,0,0};
		Scanner num = new Scanner(System.in);
		int i = num.nextInt();
		while(i != 6) {
			switch(i){
				case 1:
					System.out.println("您购买了"+vend[i-1]);
					count[i-1]++;
					break;
				case 2:
					System.out.println("您购买了"+vend[i-1]);
					count[i-1]++;
					break;
				case 3:
					System.out.println("您购买了"+vend[i-1]);
					count[i-1]++;
					break;
				case 4:
					System.out.println("您购买了"+vend[i-1]);
					count[i-1]++;
					break;
				case 5:
					for (int j = 0; j < count.length; j++) {
						if(count[j] != 0)
							System.out.println("您购买了"+count[j]+vend[j]);
					}
					break;
				default:
					System.out.println("错误,请输入1~6以内的数字!");
					break;
			}
			buy.menu();
			i = num.nextInt();
		}
	}
	public void menu() {
		System.out.println("[1]口香糖");
		System.out.println("[2]巧克力");
		System.out.println("[3]爆米花");
		System.out.println("[4]果汁");
		System.out.println("[5]显示购买总数");
		System.out.println("[6]退出");
		System.out.println("请输入要进行的操作:");
	}
}

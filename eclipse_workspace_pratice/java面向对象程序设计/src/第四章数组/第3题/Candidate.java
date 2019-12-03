package 第四章数组.第3题;

import java.util.Scanner;

public class Candidate {
	public static void main(String[] args) {
		System.out.println("请输入竞选人的姓名和得票数(如:张三 5):");
		/*张三 18
		李四 16
		王五 14
		赵六 12
		卢 20*/
		Scanner candidate = new Scanner(System.in);
		String[] name = new String[5];
		int[] ticket = new int[5];
		int sum = 0;
		for (int i = 0; i < ticket.length; i++) {
			name[i] = candidate.next();
			ticket[i] = candidate.nextInt();
			sum += ticket[i];
		}
		int max = ticket[0];
		int j = 0;
		for (int i = 0; i < ticket.length; i++) {
			System.out.println("竞选人姓名:"+name[i]+"---->得票数:"+ticket[i]+"---->得票数百分比:"+100.0*ticket[i]/sum+"%");
			if(max < ticket[i]) {
				j = i;
			}
		}
		System.out.println("该次获胜者第一名为---->"+name[j]);
	}
}

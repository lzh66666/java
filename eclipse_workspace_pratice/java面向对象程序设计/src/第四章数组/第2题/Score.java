package 第四章数组.第2题;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner player = new Scanner(System.in);
		double[] score = new double[8];
		double sum = 0;
		System.out.println("请输入8格裁判的评分(在1~10分):");
		//9.2 9.3 9.0 9.9 9.5 9.5 9.6 9.8
		for (int i = 0; i < score.length; i++) {
			score[i] = player.nextDouble();
			sum += score[i];
		}
		double max=score[0],min=score[0];
		for (double d : score) {
			if(min>d) {
				min = d;
			}
			if(max<d) {
				max = d;
			}
		}
		System.out.printf("选手总分为:%4.2f",sum-min-max);
	}
}

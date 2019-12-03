package 课件中的案例.例2_11;

import java.util.Scanner;

/**
 * 用数组存放学生上学期各门功课的成绩,计算输出平均分
 * @author 卢泽华
 *
 */
public class TestArray {
	public static void main(String[] args) {
		float[] score = new float[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入上学期各门功课的成绩:");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextFloat();
		}
		float sum = 0,aver;
		for (float i : score) {
			sum += i;
		}
		aver = sum/score.length;
		System.out.println("平均成绩为:"+aver);
	}
}

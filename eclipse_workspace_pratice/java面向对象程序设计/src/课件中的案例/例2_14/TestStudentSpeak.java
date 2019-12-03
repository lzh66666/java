package 课件中的案例.例2_14;

import java.util.Scanner;

/**
 * 综合案例
 * @author 卢泽华
 *
 */
public class TestStudentSpeak {
	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		System.out.println("请输入你的姓名性别和各门功课的成绩:");
		System.out.println("姓名:");
		String name = student.next();
		
		Sex sex;
		System.out.println("性别(0代表男,1代表女):");
		int s = student.nextInt();
		if(s == 0) {
			sex = Sex.男;
		}
		else {
			sex = Sex.女;
		}
		
		double[] score = new double[4];
		System.out.println("高数:");
		score[0] = student.nextDouble();
		System.out.println("线代:");
		score[1] = student.nextDouble();
		System.out.println("C语言:");
		score[2] = student.nextDouble();
		System.out.println("思想品德修养:");
		score[3] = student.nextDouble();
		
		System.out.println("我的名字叫"+name+"。"+sex+",我上学期通过努力,取得了好成绩,各门功课的成绩如下:高数"
		+score[0]+",线代"+score[1]+",C语言"+score[2]+",思想品德修养"+score[3]+"。");
	}
}

enum Sex{
	男,女
}

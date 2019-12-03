package cn.lu01;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k=in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n=in.nextInt();
//		将1，2，3...n存入数组number中
		int[] number=new int[n];
		for (int i = 0; i < number.length; i++) {
			number[i]=i+1;
		}
		//存放抽取出来的值
		int[] result=new int[k];
		for (int i = 0; i < result.length; i++) {
			int r=(int)(Math.random()*n);
			result[i]=number[r];
			number[r]=number[n-1];
			n--;
		}
//		快速排序
		Arrays.sort(result);
		System.out.println("Bet the following combination .It'll make you rich");
		for (int r : result) {
			System.out.println(r);
		}
	}
}

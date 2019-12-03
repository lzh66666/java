package 第四章数组.第6题;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner weather = new Scanner(System.in);
		
		double[] data = new double[24];
		System.out.println("请先输入1-12月每月的最低温,在输入1-12月的最高温:");
//		-18 -12 -5 3 9 15 18 20 17 5 -3 -15 3 5 9 18 22 27 33 37 30 27 20 10 
		for (int i = 0; i < data.length; i++) {
			data[i] = weather.nextDouble();
		}
		
		double[][] temperature = new double[2][12];
		Function f = new Function();
		temperature = f.getDate(temperature, data);
		System.out.printf("最高气温的平均值:%4.2f℃\n",f.averageHeight(temperature[1]));
		System.out.printf("最低气温的平均值:%4.2f℃\n",f.averageLow(temperature[0]));
		System.out.println("一年中的最高气温是:"+temperature[1][f.indexHighTemp(temperature[1])]+"℃");
		System.out.println("一年中的最低气温是:"+temperature[0][f.indexLowTemp(temperature[0])]+"℃");
	}
}

class Function{
	public double[][] getDate(double[][] temperature,double data[]) {
		System.out.println("    月份\t   1\t   2\t  3\t 4\t 5\t  6\t  7\t  8\t  9\t 10\t  11\t  12");
		System.out.print("最低气温\t");
		for (int i = 0; i < data.length/2; i++) {
			System.out.print(data[i]+"℃\t");
		}
		System.out.printf("\n最高气温\t");
		for (int i = data.length/2; i < data.length; i++) {
			System.out.print(data[i]+"℃\t");
		}
		System.out.println();
		int k = 0;
		for (int i = 0; i < temperature.length; i++) {
			for (int j = 0; j < temperature[i].length; j++) {
				temperature[i][j] = data[k++];
			}
		}
		return temperature;
	}
	
	public double averageHeight(double[] temperature) {
		double average = 0;
		for (double d : temperature) {
			average += d;
		}
		return average/temperature.length;
	}
	
	public double averageLow(double[] temperature) {
		double average = 0;
		for (double d : temperature) {
			average += d;
		}
		return average/temperature.length;
	}
	
	public int indexHighTemp(double[] temperature) {
		int max_i=0;
		double max = temperature[0];
		for (int i = 1; i < temperature.length; i++) {
			if(max < temperature[i]) {
				max = temperature[i];
				max_i = i;
			}
		}
		return max_i;
	}
	
	public int indexLowTemp(double[] temperature) {
		int min_i=0;
		double min = temperature[0];
		for (int i = 1; i < temperature.length; i++) {
			if(min > temperature[i]) {
				min = temperature[i];
				min_i = i;
			}
		}
		return min_i;
	}
}

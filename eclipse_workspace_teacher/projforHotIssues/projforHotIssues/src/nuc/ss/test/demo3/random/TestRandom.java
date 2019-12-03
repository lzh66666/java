package nuc.ss.test.demo3.random;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// 使用java.util.Random类可以产生一个 int、long、double、float和boolean型随机值。
		// 创建一个random对象时，必须指定一个种子或使用默认的种子。无参构造方法使用当前已经逝去的时间作为种子。
		// 如果两个random对象使用了相同的种子，那么它们将产生相同的随机数列。这个特性（产生相同随机序列）在软件测试等应用中很有用。
		Random random1 = new Random(3);
		System.out.print("随机数列1：");
		for (int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(100) + " ");
		}

		System.out.println();
		
		Random random2 = new Random(3);
		System.out.print("随机数列2：");
		for (int i = 0; i < 10; i++) {
			System.out.print(random2.nextInt(100) + " ");
		}
		
		System.out.println();
		
		Random random3 = new Random(5);
		System.out.print("随机数列3：");
		for (int i = 0; i < 10; i++) {
			System.out.print(random3.nextInt(100) + " ");
		}
		
		System.out.println();
		
		Random random4 = new Random();
		System.out.print("随机数列4：");
		for (int i = 0; i < 10; i++) {
			System.out.print(random4.nextInt(100) + " ");
		}		
		
	}

}

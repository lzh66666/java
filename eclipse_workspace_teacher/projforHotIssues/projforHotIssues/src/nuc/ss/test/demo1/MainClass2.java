package nuc.ss.test.demo1;

/*
	问题描述: 给定n个不同的整数，问这些数中有多少对整数，它们的值正好相差1。
	输入格式: 输入的第一行包含一个整数n，表示给定整数的个数。
                               第二行包含所给定的n个整数。
	输出格式: 输出一个整数，表示值正好相差1的数对的个数。
	样例输入:
	6
	10 2 6 3 7 8
	样例输出:
	3
	样例说明: 值正好相差1的数对包括(2, 3), (6, 7), (7, 8)。
	评测用例规模与约定: 1<=n<=1000，给定的整数为不超过10000的非负整数。
*/

import java.util.Scanner;

public class MainClass2 {
	
    public static void main(String[] args) {
        new MainClass2().test();
    }

    private void test() {
        Scanner sc = new Scanner(System.in);

//      int count = Integer.parseInt(sc.next());
        int count = sc.nextInt();

        String[] numbers = {};

        int res = 0;

        sc.nextLine();

        numbers = sc.nextLine().split(" ");

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (Math.abs((Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[j]))) == 1) {
                    res++;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}

/* 总结：
 * next()：这个函数会扫描从有效字符起到空格，Tab，回车等结束字符之间的内容并作为String返回。
 * nextLine()：这个函数在你输入完一些东西之后按下回车则视为输入结束，输入的内容将被作为String返回。
 * 区别：next()什么都不输入直接敲回车不会返回，而nextLine()即使不输入东西直接敲回车也会返回。 * 
 * 
 */
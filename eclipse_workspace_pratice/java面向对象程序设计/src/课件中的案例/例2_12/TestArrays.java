package 课件中的案例.例2_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 文具排序
 * @author 卢泽华
 *
 */
public class TestArrays {
	public static void main(String[] args) {
		String[] words = {"ruler","rubber","pen","pencil","book","ink","globe"};
		String[] wordsCopy = Arrays.copyOf(words, words.length);
		Arrays.sort(wordsCopy);
		for (int i = 0; i < words.length; i++) {
			System.out.printf("%-8s",words[i]);
		}
		System.out.println();
		for (String s : wordsCopy) {
			System.out.printf("%-8s",s);
		}
		System.out.println();
		Scanner sc =new Scanner(System.in);
		System.out.println("请从键盘输入要检索的文具:");
		String key = sc.next();
		int index = Arrays.binarySearch(wordsCopy, key);
		if(index >= 0) {
			System.out.println("文具"+key+"在数组内"+index+"号位置!");
		}
		else {
			System.out.println("文具"+key+"不存在");
		}
	}
}

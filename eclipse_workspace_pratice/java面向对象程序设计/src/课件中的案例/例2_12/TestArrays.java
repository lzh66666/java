package �μ��еİ���.��2_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �ľ�����
 * @author ¬��
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
		System.out.println("��Ӽ�������Ҫ�������ľ�:");
		String key = sc.next();
		int index = Arrays.binarySearch(wordsCopy, key);
		if(index >= 0) {
			System.out.println("�ľ�"+key+"��������"+index+"��λ��!");
		}
		else {
			System.out.println("�ľ�"+key+"������");
		}
	}
}

package nuc.ss.test.demo1;

/*
	��������: ����n����ͬ������������Щ�����ж��ٶ����������ǵ�ֵ�������1��
	�����ʽ: ����ĵ�һ�а���һ������n����ʾ���������ĸ�����
                               �ڶ��а�����������n��������
	�����ʽ: ���һ����������ʾֵ�������1�����Եĸ�����
	��������:
	6
	10 2 6 3 7 8
	�������:
	3
	����˵��: ֵ�������1�����԰���(2, 3), (6, 7), (7, 8)��
	����������ģ��Լ��: 1<=n<=1000������������Ϊ������10000�ķǸ�������
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

/* �ܽ᣺
 * next()�����������ɨ�����Ч�ַ��𵽿ո�Tab���س��Ƚ����ַ�֮������ݲ���ΪString���ء�
 * nextLine()�������������������һЩ����֮���»س�����Ϊ�����������������ݽ�����ΪString���ء�
 * ����next()ʲô��������ֱ���ûس����᷵�أ���nextLine()��ʹ�����붫��ֱ���ûس�Ҳ�᷵�ء� * 
 * 
 */
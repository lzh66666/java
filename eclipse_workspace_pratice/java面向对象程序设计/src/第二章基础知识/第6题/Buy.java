package �ڶ��»���֪ʶ.��6��;

import java.util.Scanner;

public class Buy {
	public static void main(String[] args) {
		Buy buy = new Buy();
		buy.menu();
		String[] vend = {"��������","���ɿ���","Ͱ���׻�","����֭"};
		int[] count = {0,0,0,0};
		Scanner num = new Scanner(System.in);
		int i = num.nextInt();
		while(i != 6) {
			switch(i){
				case 1:
					System.out.println("��������"+vend[i-1]);
					count[i-1]++;
					break;
				case 2:
					System.out.println("��������"+vend[i-1]);
					count[i-1]++;
					break;
				case 3:
					System.out.println("��������"+vend[i-1]);
					count[i-1]++;
					break;
				case 4:
					System.out.println("��������"+vend[i-1]);
					count[i-1]++;
					break;
				case 5:
					for (int j = 0; j < count.length; j++) {
						if(count[j] != 0)
							System.out.println("��������"+count[j]+vend[j]);
					}
					break;
				default:
					System.out.println("����,������1~6���ڵ�����!");
					break;
			}
			buy.menu();
			i = num.nextInt();
		}
	}
	public void menu() {
		System.out.println("[1]������");
		System.out.println("[2]�ɿ���");
		System.out.println("[3]���׻�");
		System.out.println("[4]��֭");
		System.out.println("[5]��ʾ��������");
		System.out.println("[6]�˳�");
		System.out.println("������Ҫ���еĲ���:");
	}
}

package cn.sxt.oo;

import cn.sxt.oo2.Human;

public class TestEncapsulation2 {
	public static void main(String[] args) {
		Human h=new Human();
//		ageΪ˽������
//		h.age=12;
//		nameΪdefault���ԣ����ܱ���ͬ�İ�����
//		h.name="¬��"�� 
//		protected���Ա�ͬһ���������Լ�������������ʹ��
//		h.height="203";��ͬ��
		h.sayage();
	}
}
//��ͬ�����������ʹ��protected
class Girl extends Human{
	void sayGood() {
		System.out.println(height);
	}
}

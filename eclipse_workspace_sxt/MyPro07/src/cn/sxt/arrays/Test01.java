package cn.sxt.arrays;

public class Test01 {
	public static void main(String[] args) {
//		[]可以在前面也可以在后面
		int[] arr01=new int[10];
		String arr02[]=new String[5];
		
		
		arr01[0]=10;
		arr01[1]=13;
		arr01[2]=546;
//		通过循环初始化数组
		for (int i = 0; i < arr01.length; i++) {
			arr01[i]=10*i;
		}
//		通过循环打印数组的值
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		User[] arr03=new User[3];
		arr03[0]=new User(1001,"卢泽华1");
		arr03[1]=new User(1002,"卢泽华2");
		arr03[2]=new User(1003,"卢泽华3");
		for (int i = 0; i < arr03.length; i++) {
			System.out.println(arr03[i].getName());
		}
 	}
}



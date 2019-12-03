package cn.sxt.arrays;
/**
 * 测试数组的三种初始化方式
 * @author 卢泽华
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		静态初始化
		int[] a= {0,1,2,3};
		User[] b= {
				new User(1001, "卢泽华1"),
				new User(1002, "卢泽华2"),
				new User(1003, "卢泽华3")
			   };
//		默认初始化
		int[] c=new int[3]; //默认给数组的元素赋值，赋值的规则和成员变量赋值的规则一样
//		动态初始化
		int[] a1;//动态初始化数组
		a1=new int[3];//给数组分配空间
		a1[0]=1;//给数组元素赋值
		a1[1]=2;//给数组元素赋值
		
	}
}

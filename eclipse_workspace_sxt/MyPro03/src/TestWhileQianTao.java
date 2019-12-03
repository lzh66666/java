/**
 * 测试嵌套循环
 * @author 卢泽华
 *
 */
public class TestWhileQianTao {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("####################");
		//用while循环分别计算100以内的奇数及偶数的和，并输出
		int sum01=0;
		int sum02=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum01+=i;
			}else {
				sum02+=i;
			}
		}
		System.out.println("奇数和："+sum01);
		System.out.println("偶数和："+sum02);
		
		System.out.println("####################");
		int count=0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
				System.out.print(i+"\t");
				count++;
			}
			if(count==5) {
				System.out.println();
				count=0;
			}
		}
	}
}

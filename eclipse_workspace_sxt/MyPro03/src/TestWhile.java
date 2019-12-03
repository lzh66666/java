/**
 * 测试while循环
 * @author 卢泽华
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+4+...+100的累加和，5050
		//暴力
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}

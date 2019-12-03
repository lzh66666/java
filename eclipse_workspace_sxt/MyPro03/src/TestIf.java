/**
 * 测试if语句
 * @author 卢泽华
 *
 */
public class TestIf {
	public static void main(String[] args) {
//		double d=Math.random();
//		System.out.println(d);//返回[0,1)之间的随机数
//		System.out.println((int)(6*Math.random()+1));
		int i=(int)(6*Math.random()+1);
		int j=(int)(6*Math.random()+1);
		int k=(int)(6*Math.random()+1);
		
		int count=i+j+k;
		if(count>15) {
			System.out.println("今天手气不错！");
		}
		if(count>=10&&count<=15) {
			System.out.println("今天手气一般");
		}
		if(count<10) {
			System.out.println("今天手气不怎么样!");
		}
		System.out.println("得了"+count+"分");
	}
}

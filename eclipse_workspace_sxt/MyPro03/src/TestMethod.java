/**
 * 测试方法的基本使用
 * @author 卢泽华
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法
		TestMethod tm=new TestMethod();
		tm.printSxt();
		int c=tm.add(30, 40, 50)+1000;
		System.out.println(c);
	}
	void printSxt() {
		System.out.println("北京尚学堂");
		System.out.println("天津尚学堂");
		System.out.println("山西尚学堂");
	}
	int add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
		return sum;
	}
}

/**
 * 测试ifelse双选择结构
 * @author 卢泽华
 *
 */
public class TestIfElse {
	public static void main(String[] args) {
		int i=(int)(6*Math.random()+1);
		if(i<=3) {
			System.out.println("小");
		}
		else {
			System.out.println("大");
		}
		
		System.out.println("####################");
		
		
		//随机产生一个[0.0,4.0]的区间的半径，并根据半径求圆的周长和面积
		double r=4*Math.random();
		//Math.pow(r,2)求半径的平方
		double area=Math.PI*Math.pow(r, 2);
		double circle=2*Math.PI*r;
		System.out.println("半径为："+r);
		System.out.println("面积为："+area);
		System.out.println("周长为："+circle);
		if(area>circle) {
			System.out.println("面积大于周长！");
		}else {
			System.out.println("周长大于面积！");
		}
	}
}

package cn.sxt.oo2;
/**
 * 测试重写（覆盖）
 * @author 卢泽华
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h=new Horse();
		h.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("跑！");
	}
	public void stop() {
		System.out.println("停止！");
	}
	public person WhoIspsg() {
		return new person();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("四蹄翻飞，嘚嘚嘚嘚。。。。");
	}
//	返回值类型子类必须小于等于父类Student<person
//	方法参数相同
//	权限子类必须大于等于父类
	public Student WhoIspsg() {
		return new Student();
	}
}
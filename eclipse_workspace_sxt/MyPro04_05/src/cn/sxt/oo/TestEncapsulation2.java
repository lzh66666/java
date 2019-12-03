package cn.sxt.oo;

import cn.sxt.oo2.Human;

public class TestEncapsulation2 {
	public static void main(String[] args) {
		Human h=new Human();
//		age为私有属性
//		h.age=12;
//		name为default属性，不能被不同的包访问
//		h.name="卢泽华"； 
//		protected可以被同一个包的类以及其他报的子类使用
//		h.height="203";非同包
		h.sayage();
	}
}
//非同包的子类可以使用protected
class Girl extends Human{
	void sayGood() {
		System.out.println(height);
	}
}

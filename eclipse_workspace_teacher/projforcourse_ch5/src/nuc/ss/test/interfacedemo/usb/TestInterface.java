package nuc.ss.test.interfacedemo.usb;

interface USB{ //定义一个USB的操作标准
	public void install();
	public void work();
}

class Computer{
	public void plugin(USB usb){ // 接收USB接口实例
		usb.install();   // 调用接口方法
		usb.work();      // 调用接口方法
	}
}

class Phone implements USB{
	public void install(){
		System.out.println("安装手机驱动程序。");
	}
	public void work(){
		System.out.println("手机与电脑进行工作。");
	}
}

class Print implements USB{
	public void install(){
		System.out.println("安装打印机驱动程序。");
	}
	public void work(){
		System.out.println("进行文件打印。");
	}
}

public class TestInterface{
	public static void main(String args[]){
		Computer c = new Computer();
		c.plugin(new Phone());  // USB usb = new Phone();
		c.plugin(new Print());  // USB usb = new Print();
	}
}


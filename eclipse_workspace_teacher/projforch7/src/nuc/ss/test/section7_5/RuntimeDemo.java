package nuc.ss.test.section7_5;

import java.io.IOException;

public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("mspaint"); //打开画图软件
		//r.exec("notepad"); //打开记事本软件
		//r.exec("calc");//打开计算器
		//r.exec("shutdown -s -t 10000");//定时关机。10000毫秒后关机
		//r.exec("shutdown -a"); //取消关机命令
		
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r == r2);	
	}
}


//Runtime的部分源码：使用了单例模式的饿汉式
/*class Runtime {
	private static Runtime currentRuntime = new Runtime();
	
	private Runtime() {}

	public static Runtime getRuntime() {
		return currentRuntime;
	}
}*/


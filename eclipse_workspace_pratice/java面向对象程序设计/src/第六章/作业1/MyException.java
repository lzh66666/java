package 第六章.作业1;

public class MyException extends Exception{
	
	public MyException() {
		super("输入的尺寸有小于零的");
	}
	
	public MyException(String msg) {
		super(msg);
	}
}

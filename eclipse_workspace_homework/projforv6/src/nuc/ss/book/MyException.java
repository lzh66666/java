package nuc.ss.book;

public class MyException extends Exception{
	
	public MyException() {
		super("输入的尺寸有小于零的");
	}
	
	public MyException(String msg) {
		super(msg);
	}
}

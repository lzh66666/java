package nuc.ss.test.section9_9;

public class TestLamda {	
	public static void test(MyInterface myInterface){
        int result=myInterface.lMethod(1,2);//设置参数内容,接收返回参数
        System.out.println(result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalkShow talkshow=new TalkShow();
		talkshow.talkShow(new Doctor());//让医生和大家交谈
		talkshow.talkShow(new Talk(){
			@Override
			public void talk(){
				System.out.println("大家好，我是匿名者！");
			}
		});   //让匿名类对象和大家交谈，形式复杂，真正功能被淹没。
		
		//用Lamda表达式替换匿名类1、() ->单行语句；
		talkshow.talkShow(()->System.out.println("大家好，我是Lamda匿名者！"));
		//2、() ->{多行语句}；
		System.out.println("*******Lamda多行语句测试********");
		talkshow.talkShow(()->{
			System.out.println("大家好，我是Lamda匿名者！");
			System.out.println("我是多行信息！");
			});	
		
		//3、() ->表达式；
		test((x,y)-> x*y );//调用方法
	}

}

interface Talk{
    void talk();
}
//定义医生类，具有和别人交谈的功能
class Doctor implements Talk{
	@Override
	public void talk(){
		System.out.println("大家好，我是医生。");
	}
}
//谈话窗口类的talkShow方法让传递的对象和大家交谈
class TalkShow{
	public void  talkShow(Talk talker){
		talker.talk();
	}
}
interface MyInterface{
    int lMethod(int a,int b);
}


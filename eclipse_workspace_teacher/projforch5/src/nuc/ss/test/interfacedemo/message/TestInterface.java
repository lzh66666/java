package nuc.ss.test.interfacedemo.message;

interface  ShowMessage {
    void show(String s);
}
class TV implements ShowMessage {
   public void show(String s) { 
		  System.out.println("TV商标：" + s);  
	  }
}
class PC implements ShowMessage {
   public void show(String s) { 
		  System.out.println("PC商标：" + s );  
   }
}
public class TestInterface {
	public static void main(String args[]) {
	   ShowMessage sm;                  //声明接口变量
	   sm=new TV();                          //接口变量中存放对象的引用
	   sm.show("长城牌电视机");        //接口回调。
	   sm=new PC();                          //接口变量中存放对象的引用
	   sm.show("联想奔月5008PC机"); //接口回调
	}
}



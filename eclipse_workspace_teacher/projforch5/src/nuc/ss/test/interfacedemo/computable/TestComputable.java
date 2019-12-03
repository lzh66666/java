package nuc.ss.test.interfacedemo.computable;

public class TestComputable {
	public static void main(String args[]) {
    	China zhang = new China();  
    	
    	zhang.number = 991898 + Computable.MAX; 
    		// 接口中的常量通常使用接口名来调用，即：Computable.MAX
    	System.out.println("number: " + zhang.number + "; 求和: " + zhang.f(100));
    	
    	Japan henlu = new Japan(); 
    	
    	henlu.number = 941448 + Computable.MAX;  
    		// 接口中的常量也可以用实现类的类名来调用，例如：Japan.MAX;
    	System.out.println("number: "+ henlu.number + "; 求和: " + henlu.f(100));
	}
}

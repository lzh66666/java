package nuc.ss.test.interfacedemo.computable;

public class TestComputable {
	public static void main(String args[]) {
    	China zhang = new China();  
    	
    	zhang.number = 991898 + Computable.MAX; 
    		// �ӿ��еĳ���ͨ��ʹ�ýӿ��������ã�����Computable.MAX
    	System.out.println("number: " + zhang.number + "; ���: " + zhang.f(100));
    	
    	Japan henlu = new Japan(); 
    	
    	henlu.number = 941448 + Computable.MAX;  
    		// �ӿ��еĳ���Ҳ������ʵ��������������ã����磺Japan.MAX;
    	System.out.println("number: "+ henlu.number + "; ���: " + henlu.f(100));
	}
}

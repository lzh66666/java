package nuc.ss.test.section7_5;

class PrintSpoolerSingleton {
	private static PrintSpoolerSingleton instance = null;
	
	private PrintSpoolerSingleton() {	
	}
	
	public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException {
		if(instance == null) {
			System.out.println("创建打印池！");
		    instance = new PrintSpoolerSingleton();		
		} else {
			throw new PrintSpoolerException("打印池正在工作中！");
		}
		
		return instance;
	}
	
	public void manageJobs() {
	    System.out.println("管理打印任务！");
	}
}

class PrintSpoolerException extends Exception {
	public PrintSpoolerException() {	
		super("打印池正在工作中！");
	}
	
	public PrintSpoolerException(String message) {	
		super(message);
	}
}

public class TestPrintSpoolerSingleton {
	public static void main(String[] args) {
	   PrintSpoolerSingleton ps1, ps2;
	   try {
	        ps1 = PrintSpoolerSingleton.getInstance();
	        ps1.manageJobs();	
	   } catch(PrintSpoolerException e) {
	   	    System.out.println(e.getMessage());
	   }
	   
	   System.out.println("--------------------------");
	   
	   try {
	       ps2 = PrintSpoolerSingleton.getInstance(); 
	       ps2.manageJobs();  	
	   } catch(PrintSpoolerException e) {
	       System.out.println(e.getMessage());
	   }
	}
}




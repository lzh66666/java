package nuc.ss.test.section7_3;

public class Client {
	public static void main(String args[]) {
         try {
         	TV tv;
         	String brandName;
         	//brandName = "Haier"; 
         	brandName = "Hisense";
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         } catch(Exception e) {
         	System.out.println(e.getMessage());
         }
	}
}

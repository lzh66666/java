package nuc.ss.test.section7_4;

public class Client {
	public static void main(String args[]) {
         	TV tv;
         	TVFactory factory;
         	factory = new HaierTVFactory();
         	//factory = new HisenseTVFactory();
         	tv = factory.produceTV();
         	tv.play();
	}
}

/**
 * ²âÊÔÑ­»·Óï¾äÖĞµÄbreakÓï¾ä
 * @author Â¬Ôó»ª
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total=0;
		System.out.println("Begin");
		while(true) { 
			total++;
			int i=(int)(100*Math.random());
			System.out.println(i);
			if(i==88) {
				break;
			}
		}
		System.out.println("Come Over,Used "+total+" times");
	}
}

package �μ��еİ���.��2_13;
/**
 * ö������
 * @author ¬��
 *
 */
public class TestEnum {
	public static void main(String[] args) {
		double price = 0;
		for(Fruit fruit:Fruit.values()) {
			switch(fruit) {
				case APPLE:
					price = 4.5;
					break;
				case BANNER:
					price = 2.5;
					break;
				case PEAR:
					price = 2.3;
					break;
				case PEACH:
					price = 3.6;
					break;
			}
			System.out.println(fruit+"ÿ��ļ۸�"+price+"Ԫ!");
		}
	}
}
enum Fruit{
	APPLE,BANNER,PEAR,PEACH
}

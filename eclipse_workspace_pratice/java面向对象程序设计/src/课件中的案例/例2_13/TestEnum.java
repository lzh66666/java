package 课件中的案例.例2_13;
/**
 * 枚举类型
 * @author 卢泽华
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
			System.out.println(fruit+"每斤的价格"+price+"元!");
		}
	}
}
enum Fruit{
	APPLE,BANNER,PEAR,PEACH
}

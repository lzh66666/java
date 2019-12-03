package projfor_c113_lzh_shoping.CartyException;

public class CartyException extends Exception{
	public CartyException() {
		super("您要购买的商品数量不足！");
	}
	public CartyException(String message) {
		super(message);
	}

}

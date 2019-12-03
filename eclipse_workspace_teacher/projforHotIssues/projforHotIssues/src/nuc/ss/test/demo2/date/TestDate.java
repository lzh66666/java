package nuc.ss.test.demo2.date;

/**
 * 此类演示日期类java.util.Date的基本用法
 * @author dell
 *
 */
public class TestDate {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date(); // 使用Date类中的无参构造方法为当前的日期和时间创建一个Date实例
		System.out.println("从GMT时间1970年1月1日算起至今逝去的时间（毫秒数）：" + date.getTime()); //GMT: 英国格林威治时间（即世界标准时间）
		System.out.println(date); // 或 	System.out.println(date.toString());
		
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		String current = sdf.format(date);
		System.out.println(current);
	}

}

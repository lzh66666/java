package nuc.ss.test.abstractdemo.motorvehicle_3;

abstract class MotorVehicle { // 机动车
	abstract void start();  // 启动
	abstract void speed_up();  // 加速
	abstract void speed_down();  // 刹车
	abstract String getCarName(); // 获取car的名称
}
class Simulator{
    void playOpration(MotorVehicle  car) {
         System.out.println(car.getCarName() + "的操作如下：");
         car.start();       
         car.speed_up();     
         car.speed_down();
    }
}
class ManuCar extends MotorVehicle  {  // 手动档轿车
    void start() {
        System.out.println("踏下离合器，换到一挡");
        System.out.println("然后慢慢抬起离合器");
    }
    void speed_up() {    
    	System.out.println("踩油门"); 
    }
    void speed_down() {
        System.out.println("踏下离合器，踏下刹车板");
        System.out.println("然后将挡位换到一挡");
    }
	@Override
	String getCarName() {
		return "手动档轿车";
	}
}
class AutoCar extends MotorVehicle { //自动档轿车
    void start() {
        System.out.println("使用前进挡");
        System.out.println("然后轻踩油门");
    }
    void speed_up() { 
    	System.out.println("踩油门"); 
    }
    void speed_down() {
        System.out.println("踏下刹车板");
    }
	@Override
	String getCarName() {
		return "自动档轿车";
	}
}
public class TestAbstract {
    public static void main(String args[]) {
    	Simulator simulator = new Simulator();
    	simulator.playOpration(new ManuCar());
    	simulator.playOpration(new AutoCar());
    }
}

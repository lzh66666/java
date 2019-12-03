package nuc.ss.test.abstractdemo.motorvehicle_3;

abstract class MotorVehicle { // ������
	abstract void start();  // ����
	abstract void speed_up();  // ����
	abstract void speed_down();  // ɲ��
	abstract String getCarName(); // ��ȡcar������
}
class Simulator{
    void playOpration(MotorVehicle  car) {
         System.out.println(car.getCarName() + "�Ĳ������£�");
         car.start();       
         car.speed_up();     
         car.speed_down();
    }
}
class ManuCar extends MotorVehicle  {  // �ֶ����γ�
    void start() {
        System.out.println("̤�������������һ��");
        System.out.println("Ȼ������̧�������");
    }
    void speed_up() {    
    	System.out.println("������"); 
    }
    void speed_down() {
        System.out.println("̤���������̤��ɲ����");
        System.out.println("Ȼ�󽫵�λ����һ��");
    }
	@Override
	String getCarName() {
		return "�ֶ����γ�";
	}
}
class AutoCar extends MotorVehicle { //�Զ����γ�
    void start() {
        System.out.println("ʹ��ǰ����");
        System.out.println("Ȼ���������");
    }
    void speed_up() { 
    	System.out.println("������"); 
    }
    void speed_down() {
        System.out.println("̤��ɲ����");
    }
	@Override
	String getCarName() {
		return "�Զ����γ�";
	}
}
public class TestAbstract {
    public static void main(String args[]) {
    	Simulator simulator = new Simulator();
    	simulator.playOpration(new ManuCar());
    	simulator.playOpration(new AutoCar());
    }
}

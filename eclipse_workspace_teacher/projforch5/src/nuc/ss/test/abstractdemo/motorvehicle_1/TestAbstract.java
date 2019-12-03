package nuc.ss.test.abstractdemo.motorvehicle_1;

abstract class MotorVehicle { // ������
	abstract void start();  // ����
	abstract void speed_up();  // ����
	abstract void speed_down();  // ɲ��
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
}
public class TestAbstract {
    public static void main(String args[]) {
    	MotorVehicle car = new ManuCar();
        System.out.println("�ֶ����γ��Ĳ�����");
        car.start();   
        car.speed_up();   
        car. speed_down();
        car = new AutoCar();
        System.out.println("�Զ����γ��Ĳ�����");
        car.start();   
        car.speed_up();   
        car.speed_down();
    }
}
